package com.revature.planit.dayplan.dtos.requests;

public class UpdateRestaurantRequest {
    private String restaurant;
    private String dayplan_id;

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getDayplan_id() {
        return dayplan_id;
    }

    public void setDayplan_id(String dayplan_id) {
        this.dayplan_id = dayplan_id;
    }

    public UpdateRestaurantRequest(String restaurant, String dayplan_id) {
        this.restaurant = restaurant;
        this.dayplan_id = dayplan_id;


    }
}
