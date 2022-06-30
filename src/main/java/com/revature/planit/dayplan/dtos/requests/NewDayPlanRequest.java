package com.revature.planit.dayplan.dtos.requests;

public class NewDayPlanRequest {
    private int day_of_trip;
    private String day_activity;
    private String day_activity_id;
    private String night_activity;
    private String night_activity_id;
    private String restaurant;
    private String restaurant_id;
    private String category;

    public NewDayPlanRequest() {
    }

    public NewDayPlanRequest(int day_of_trip, String day_activity,
                             String day_activity_id, String night_activity,
                             String night_activity_id, String restaurant,
                             String restaurant_id, String category) {
        this.day_of_trip = day_of_trip;
        this.day_activity = day_activity;
        this.day_activity_id = day_activity_id;
        this.night_activity = night_activity;
        this.night_activity_id = night_activity_id;
        this.restaurant = restaurant;
        this.restaurant_id = restaurant_id;
        this.category = category;
    }

//    public NewDayPlanRequest(int day_of_trip, String day_activity,
//                             String night_activity, String restaurant, String category) {
//        this.day_of_trip = day_of_trip;
//        this.day_activity = day_activity;
//        this.night_activity = night_activity;
//        this.restaurant = restaurant;
//        this.category = category;
//    }


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

    @Override
    public String toString() {
        return "NewDayPlanRequest{" +
                "day_of_trip=" + day_of_trip +
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
