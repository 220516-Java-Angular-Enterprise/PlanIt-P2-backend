

package com.revature.planit.trips;

import com.revature.planit.user.User;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trip")

public class Trips {
    @Id
    private String id;
    @Column(name="destination",nullable = false)
    private String destination;
    @Column(name="hotel",nullable = false)
    private String hotel;
    @Column(name = "status")
    private String status;
//    @OneToMany
//    @JoinColumn(name="day_plan_ID", nullable = false)
//    private DayPlan dayPlan;
    @ManyToOne
    @JoinColumn(name="user_id",nullable=false)
    private User user;

    public Trips(String id, String destination, String hotel, String status, User user) {
        this.id = id;
        this.destination = destination;
        this.hotel = hotel;
        this.status = status;
        this.user = user;
    }

    public Trips(String id, String destination, String hotel, String status) {
        this.id = id;
        this.destination = destination;
        this.hotel = hotel;
        this.status = status;
    }

    public Trips(String hotel, String destination, String status) {
        this.destination = destination;
        this.hotel = hotel;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Trips{" +
                "id='" + id + '\'' +
                ", destination='" + destination + '\'' +
                ", hotel='" + hotel + '\'' +
                ", status='" + status + '\'' +
                ", user=" + user +
                '}';
    }
}





