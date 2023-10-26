package com.smartcoder.entity.dto;
public class UserRegistrationDTO {

    private String userType;
    private String username;
    private String password;
    private String email;

    // Constructors

    public UserRegistrationDTO() {}

    public UserRegistrationDTO(String userType, String username, String password, String email, String language) {
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getters and Setters

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "UserRegistrationDTO{" +
                "userType='" + userType + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

