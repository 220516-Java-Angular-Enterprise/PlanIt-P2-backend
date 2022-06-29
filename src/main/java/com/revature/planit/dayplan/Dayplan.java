package com.revature.planit.dayplan;

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

    @Column(name = "day_activity_id", nullable = false)
    private String day_activity_id;

    @Column(name="night_activity",nullable = false)
    private String night_activity;

    @Column(name = "night_activity_id", nullable = false)
    private String night_activity_id;

    @Column(name="restaurant",nullable=false)
    private String restaurant;

    @Column(name = "restaurant_id", nullable = false)
    private String restaurant_id;

    @Column(name="category",nullable = false)
    private String category;

//@OneToMany
//        (mappedBy = "dayplan",
//        fetch = FetchType.EAGER,
//        cascade = CascadeType.ALL)
//@JsonManagedReference
//private TripPlan tripPlan;

    public Dayplan() {
        super();
    }

    public Dayplan(String id, int day_of_trip, String day_activity,
                   String day_activity_id, String night_activity, String night_activity_id,
                   String restaurant, String restaurant_id, String category) {
        this.id = id;
        this.day_of_trip = day_of_trip;
        this.day_activity = day_activity;
        this.day_activity_id = day_activity_id;
        this.night_activity = night_activity;
        this.night_activity_id = night_activity_id;
        this.restaurant = restaurant;
        this.restaurant_id = restaurant_id;
        this.category = category;
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

    public String getDay_activity_id() {
        return day_activity_id;
    }

    public void setDay_activity_id(String day_activity_id) {
        this.day_activity_id = day_activity_id;
    }

    public String getNight_activity() {
        return night_activity;
    }

    public void setNight_activity(String night_activity) {
        this.night_activity = night_activity;
    }

    public String getNight_activity_id() {
        return night_activity_id;
    }

    public void setNight_activity_id(String night_activity_id) {
        this.night_activity_id = night_activity_id;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(String restaurant_id) {
        this.restaurant_id = restaurant_id;
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
                ", day_activity_id='" + day_activity_id + '\'' +
                ", night_activity='" + night_activity + '\'' +
                ", night_activity_id='" + night_activity_id + '\'' +
                ", restaurant='" + restaurant + '\'' +
                ", restaurant_id='" + restaurant_id + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
