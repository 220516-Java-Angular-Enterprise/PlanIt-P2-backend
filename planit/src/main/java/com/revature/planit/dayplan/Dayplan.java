package com.revature.planit.dayplan;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.revature.planit.dayplan.dtos.requests.NewDayPlanRequest;


import javax.persistence.*;

@Entity
@Table(name="dayplan")
public class Dayplan {
    @Id
    private String id;

    @Column(name="day_of_trip",nullable = false)
    private int day_of_trip;

    @Column(name="day_activity",nullable = false)
    private String day_activity;

    @Column(name="night_activity",nullable = false)
    private String night_activity;

    @Column(name="restaurant",nullable=false)
    private String restaurant;

    @Column(name="category",nullable = false)
    private String category;
//@OneToMany
//        (mappedBy = "dayplan",
//        fetch = FetchType.EAGER,
//        cascade = CascadeType.ALL)
//@JsonManagedReference
//private TripPlan tripPlan;
    public Dayplan() {
    }

    public Dayplan(String id, NewDayPlanRequest request) {
        this.id=id;
        this.day_of_trip=request.getDay_of_trip();
        this.day_activity=request.getDay_activity();
        this.night_activity= request.getNight_activity();
        this.restaurant=request.getRestaurant();
        this.category= request.getCategory();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDay_of_trip() {
        return day_of_trip;
    }

    public void setDay_of_trip(int day_of_trip) {
        this.day_of_trip = day_of_trip;
    }

    public String getDay_activity() {
        return day_activity;
    }

    public void setDay_activity(String day_activity) {
        this.day_activity = day_activity;
    }

    public String getNight_activity() {
        return night_activity;
    }

    public void setNight_activity(String night_activity) {
        this.night_activity = night_activity;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public TripPlan getTripPlan() {
//        return tripPlan;
//    }
//
//    public void setTripPlan(TripPlan tripPlan) {
//        this.tripPlan = tripPlan;
//    }

    @Override
    public String toString() {
        return "Dayplan{" +
                "id='" + id + '\'' +
                ", day_of_trip=" + day_of_trip +
                ", day_activity='" + day_activity + '\'' +
                ", night_activity='" + night_activity + '\'' +
                ", restaurant='" + restaurant + '\'' +
                ", category='" + category + '\'' +
//                ", tripPlan=" + tripPlan +
                '}';
    }
}
