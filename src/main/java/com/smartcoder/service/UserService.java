package com.smartcoder.service;


import com.smartcoder.entity.User;
import com.smartcoder.entity.dto.ChangePasswordDTO;
import com.smartcoder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found : " + username));

        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid account or password");
        }

        return user;
    }

    public void changePassword(ChangePasswordDTO changePasswordDTO) {
        User user = userRepository.findByUsername(changePasswordDTO.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found : " + changePasswordDTO.getUsername()));

        // Verify old password
        if (!passwordEncoder.matches(changePasswordDTO.getOldPassword(), user.getPassword())) {
            throw new RuntimeException("Old password is incorrect");
        }

        user.setPassword(passwordEncoder.encode(changePasswordDTO.getNewPassword()));
        userRepository.save(user);
    }

}
