package com.smartcoder.service;


import com.smartcoder.common.Result;
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

    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public User register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public Result login(String username, String password) {
        User user = userRepository.findByUsername(username).orElse(null);

        if (user == null) {
            return Result.fail("User not found: " + username);
        }

        if (!passwordEncoder.matches(password, user.getPassword())) {
            return Result.fail("Invalid account or password");
        }

        return Result.success(user,"Login successfully!");
    }

    public Result changePassword(ChangePasswordDTO changePasswordDTO) {
        User user = userRepository.findByUsername(changePasswordDTO.getUsername()).orElse(null);

        if (user == null) {
            return Result.fail("User not found: " + changePasswordDTO.getUsername());
        }

        // Verify old password
        if (!passwordEncoder.matches(changePasswordDTO.getOldPassword(), user.getPassword())) {
            return Result.fail("Old password is incorrect");
        }

        user.setPassword(passwordEncoder.encode(changePasswordDTO.getNewPassword()));
        userRepository.save(user);
        return Result.success("Password changed successfully");
    }

    public Result getUsernameById(int userId) {
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            return Result.fail("User not found for ID: " + userId);
        }
        return Result.success(user.getUsername(),"Find it successfully!");
    }

}
