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
    @Column(name="day_activity1",nullable = false)
    private String day_activity1;
    @Column(name="day_activity2",nullable = false)
    private String day_activity2;
    @Column(name="day_activity3",nullable = false)
    private String day_activity3;
    @Column(name="food1",nullable = false)
    private String food1;
    @Column(name="food2",nullable = false)
    private String food2;
    @Column(name="food3",nullable = false)
    private String food3;
    @Column(name="night_activity1",nullable = false)
    private String night_activity1;
    @Column(name="night_activity2",nullable = false)
    private String night_activity2;

    @ManyToOne
    @JoinColumn(name="user_id",nullable=false)
    private User user;

    //@ManyToOne
   // @JoinColumn(name="category_id")
    //private Categories categories;

    public Trips() {
    }

    public Trips(String id, String destination, String hotel, String day_activity1, String day_activity2,
                 String day_activity3, String food1, String food2, String food3, String night_activity1,
                 String night_activity2) {
        this.id = id;
        this.destination = destination;
        this.hotel = hotel;
        this.day_activity1 = day_activity1;
        this.day_activity2 = day_activity2;
        this.day_activity3 = day_activity3;
        this.food1 = food1;
        this.food2 = food2;
        this.food3 = food3;
        this.night_activity1 = night_activity1;
        this.night_activity2 = night_activity2;
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

    public String getDay_activity1() {
        return day_activity1;
    }

    public void setDay_activity1(String day_activity1) {
        this.day_activity1 = day_activity1;
    }

    public String getDay_activity2() {
        return day_activity2;
    }

    public void setDay_activity2(String day_activity2) {
        this.day_activity2 = day_activity2;
    }

    public String getDay_activity3() {
        return day_activity3;
    }

    public void setDay_activity3(String day_activity3) {
        this.day_activity3 = day_activity3;
    }

    public String getFood1() {
        return food1;
    }

    public void setFood1(String food1) {
        this.food1 = food1;
    }

    public String getFood2() {
        return food2;
    }

    public void setFood2(String food2) {
        this.food2 = food2;
    }

    public String getFood3() {
        return food3;
    }

    public void setFood3(String food3) {
        this.food3 = food3;
    }

    public String getNight_activity1() {
        return night_activity1;
    }

    public void setNight_activity1(String night_activity1) {
        this.night_activity1 = night_activity1;
    }

    public String getNight_activity2() {
        return night_activity2;
    }

    public void setNight_activity2(String night_activity2) {
        this.night_activity2 = night_activity2;
    }

    @Override
    public String toString() {
        return "Trips{" +
                "id='" + id + '\'' +
                ", destination='" + destination + '\'' +
                ", hotel='" + hotel + '\'' +
                ", day_activity1='" + day_activity1 + '\'' +
                ", day_activity2='" + day_activity2 + '\'' +
                ", day_activity3='" + day_activity3 + '\'' +
                ", food1='" + food1 + '\'' +
                ", food2='" + food2 + '\'' +
                ", food3='" + food3 + '\'' +
                ", night_activity1='" + night_activity1 + '\'' +
                ", night_activity2='" + night_activity2 + '\'' +
                '}';
    }
}

