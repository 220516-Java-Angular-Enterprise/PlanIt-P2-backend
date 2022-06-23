package com.revature.planit.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.revature.planit.trips.Trips;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id // Primary key
    private String id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "f_Name", nullable = false)
    private String fName;

    @OneToMany(
            mappedBy = "user",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    @JsonManagedReference
    private List <Trips> trips;


    public User() {
    }

    public User(String username, String password, String fName) {
        this.username = username;
        this.password = password;
        this.fName = fName;
    }

    public User(String id, String username, String password, String fName) {
        this.id = id;
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }



    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fName='" + fName + '\'' +
                '}';
    }
}