package com.smartcoder.controller;


import com.smartcoder.common.Result;
import com.smartcoder.entity.CommonUser;
import com.smartcoder.entity.Programmer;
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
        User user;
        // Check if username or email already exists
        if(userService.existsByUsername(userDto.getUsername())) {
            return Result.fail("Username is already taken.");
        }

        if(userService.existsByEmail(userDto.getEmail())) {
            return Result.fail("Email is already registered.");
        }
        if ("PROGRAMMER".equalsIgnoreCase(userDto.getUserType())) {
            Programmer programmer = new Programmer();
            programmer.setUsername(userDto.getUsername());
            programmer.setPassword(userDto.getPassword());
            programmer.setEmail(userDto.getEmail());
            user = programmer;
        } else if ("COMMONUSER".equalsIgnoreCase(userDto.getUserType())) {
            CommonUser commonUser = new CommonUser();
            commonUser.setUsername(userDto.getUsername());
            commonUser.setPassword(userDto.getPassword());
            commonUser.setEmail(userDto.getEmail());
            user = commonUser;
        } else {
            //throw new IllegalArgumentException("Invalid userType");
            return Result.fail("Invalid userType.");
        }

        return Result.success(userService.register(user),"Login successfully");
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
    public Result getUsernameById(@PathVariable int userId) {
        return userService.getUsernameById(userId);
    }



}
