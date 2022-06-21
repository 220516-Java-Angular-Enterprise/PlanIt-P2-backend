package com.revature.planit.user.dtos;

import com.revature.planit.user.User;

public class NewUserRequest {
    private String username;
    private String password;

    private String fName;

    public NewUserRequest() {
        super();
    }

    public NewUserRequest(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getfName() {
        return fName;
    }
    public User extractUser() {
        return new User(username, password, fName);
    }

    @Override
    public String toString() {
        return "NewUserRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fName='" + fName + '\'' +
                '}';
    }
}