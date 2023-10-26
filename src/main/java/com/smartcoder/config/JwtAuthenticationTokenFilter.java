package com.smartcoder.config;

import com.smartcoder.entity.User;
import com.smartcoder.repository.UserRepository;
import com.smartcoder.service.UserService;
import com.smartcoder.utils.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.ArrayList;

@Configuration
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    @Autowired
    private UserRepository userRepository;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //Get the token from the request header
        String authHeader = request.getHeader(JwtUtil.AUTHORIZATION);
        // Extract the token
        if (authHeader != null && authHeader.startsWith(JwtUtil.TOKEN_PREFIX)) {
            System.out.println("authToken:" + authHeader);
            //Validate the token and retrieve the username from the token
            String username;
            try {
                username = JwtUtil.validateToken(authHeader);
            }catch (Exception e) {
                throw new ServletException("Token validation failed!");
            }

            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                // Retrieve user information corresponding to the username from the database
                User user = userRepository.findByUsername(username).orElse(null);
                if (user != null) {
                    // Generate userDetails based on user information
                    UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
                    // make authenticationToken
                    UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    // put authenticationToken into SecurityContextHolder
                    authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(authenticationToken);
                }
            }
        }
        filterChain.doFilter(request, response);
    }
}
