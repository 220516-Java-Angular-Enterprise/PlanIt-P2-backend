package com.revature.planit.trips.dtos.requests;

import com.revature.planit.trips.Trips;

public class NewTripRequest {
    private String hotel;
    private String food;
    private String day_activity;
    private String night_activity;
    public NewTripRequest(String hotel, String food, String day_activity, String night_activity) {
        this.hotel = hotel;
        this.food = food;
        this.day_activity = day_activity;
        this.night_activity = night_activity;
    }

    public NewTripRequest(){super();}

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
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

    public Trips extractTrip(){return new Trips(hotel, night_activity,day_activity,food);}

    @Override
    public String toString() {
        return "NewTripRequest{" +
                "hotel='" + hotel + '\'' +
                ", food='" + food + '\'' +
                ", day_activity='" + day_activity + '\'' +
                ", night_activity='" + night_activity + '\'' +
                '}';
    }
}
