package com.smartcoder.controller;


import com.smartcoder.common.Result;
import com.smartcoder.entity.User;
import com.smartcoder.entity.dto.ChangePasswordDTO;
import com.smartcoder.entity.dto.UserLoginDTO;
import com.smartcoder.entity.dto.UserRegistrationDTO;
import com.smartcoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/auth/register")
    public Result register(@RequestBody UserRegistrationDTO userDto) {
        // Check if username or email already exists
        if(userService.existsByUsername(userDto.getUsername())) {
            return Result.fail("Username is already taken.");
        }

        if(userService.existsByEmail(userDto.getEmail())) {
            return Result.fail("Email is already registered.");
        }
        if (!"PROGRAMMER".equalsIgnoreCase(userDto.getUserType()) &&
                !"COMMONUSER".equalsIgnoreCase(userDto.getUserType())) {
            return Result.fail("Invalid userType");
        }else{
            User user = new User();
            user.setUserType(userDto.getUserType());
            user.setUsername(userDto.getUsername());
            user.setPassword(userDto.getPassword());
            user.setEmail(userDto.getEmail());
            user.setUserType(userDto.getUserType());
            return Result.success(userService.register(user),"Register successfully");
        }


    }


    @PostMapping("/auth/login")
    public Result login(@RequestBody UserLoginDTO userLoginDto) {
        //User login = userService.login(userLoginDto.getUsername(), userLoginDto.getPassword());
        return userService.login(userLoginDto.getUsername(), userLoginDto.getPassword());

    }


    @PutMapping("/auth/change-password")
    public Result changePassword(@RequestBody ChangePasswordDTO changePasswordDTO) {
        return userService.changePassword(changePasswordDTO);

    }

    @GetMapping("/auth/getusername/{userId}")
    public Result getUsernameById(Integer userId) {
        return userService.getUsernameById(userId);
    }



}
