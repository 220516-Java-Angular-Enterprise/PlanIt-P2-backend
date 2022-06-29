package com.revature.planit.auth.dtos.responses;

import com.revature.planit.user.User;

public class Principal {
    private String id;
    private String username;
    private String fName;

    public Principal() {
        super();
    }

    public Principal(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.fName = user.getfName();
    }

    public Principal(String id, String username, String fName) {
        this.id = id;
        this.username = username;
        this.fName = fName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fName='" + fName + '\'' +
                '}';
    }
}
