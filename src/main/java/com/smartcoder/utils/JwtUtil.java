package com.smartcoder.utils;

import io.jsonwebtoken.*;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {
    //expiry time is 24 hours
    private static final int EXPIRATION_TIME = 60*60*24;
    //secret key
    private static final String SECRET = "smartcoder";
    //prefix
    public static final String TOKEN_PREFIX = "Bearer ";
    //authorization header
    public static final String AUTHORIZATION = "Authorization";

    /**
     * generate token
     */
    public static String generateToken(String username) {
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        // set issued time
        calendar.setTime(new Date());
        // set expiry time
        // add seconds
        calendar.add(Calendar.SECOND, EXPIRATION_TIME);
        Date time = calendar.getTime();
        HashMap<String, Object> map = new HashMap<>();
        //you can put any data in the map
        map.put("username", username);
        String jwt = Jwts.builder()
                .setClaims(map)
                //issued time
                .setIssuedAt(now)
                //expiry time
                .setExpiration(time)
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
        return TOKEN_PREFIX + jwt;
    }
    /**
     *
     * JWT is usually prefixed with 'Bearer'
     */
    public static String validateToken(String token) {
        // parse the token.
        Map<String, Object> body = Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                .getBody();
        return body.get("username").toString();
    }

}

