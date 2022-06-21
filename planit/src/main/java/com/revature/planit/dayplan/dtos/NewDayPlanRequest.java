package com.revature.planit.dayplan.dtos;

public class NewDayPlanRequest {
    private int day_of_trip;
    private String day_activity;
    private String night_activity;
    private String restaurant;
    private String category;

    public NewDayPlanRequest() {
    }

    public NewDayPlanRequest(int day_of_trip, String day_activity,
                             String night_activity, String restaurant, String category) {
        this.day_of_trip = day_of_trip;
        this.day_activity = day_activity;
        this.night_activity = night_activity;
        this.restaurant = restaurant;
        this.category = category;
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

    @Override
    public String toString() {
        return "NewDayPlanRequest{" +
                "day_of_trip=" + day_of_trip +
                ", day_activity='" + day_activity + '\'' +
                ", night_activity='" + night_activity + '\'' +
                ", restaurant='" + restaurant + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
