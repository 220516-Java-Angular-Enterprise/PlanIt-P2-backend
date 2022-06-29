package com.revature.planit.trips.dtos.requests;

import com.revature.planit.trips.Trips;

public class NewTripRequest {
    private String hotel;
    private String latitude;
    private String longitude;
    private String status;
    private String user_id;
    private String dayPlan_id;

    public NewTripRequest(String hotel, String latitude, String longitude,
                          String status, String user_id, String dayPlan_id) {
        this.hotel = hotel;
        this.latitude = latitude;
        this.longitude = longitude;
        this.status = status;
        this.user_id = user_id;
        this.dayPlan_id = dayPlan_id;
    }

    public NewTripRequest() {
        super();
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDayPlan_id() {
        return dayPlan_id;
    }

    public void setDayPlan_id(String dayPlan_id) {
        this.dayPlan_id = dayPlan_id;
    }

    public Trips extractTrip() {
        return new Trips(hotel,latitude,longitude,status);
    }

    @Override
    public String toString() {
        return "NewTripRequest{" +
                "hotel='" + hotel + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", status='" + status + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
