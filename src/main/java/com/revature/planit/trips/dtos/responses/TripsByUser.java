package com.revature.planit.trips.dtos.responses;

public class TripsByUser {
    private String user_id;
    private String latitude;
    private String longitude;
    private String hotel_id;
    private String status;

    public TripsByUser(String user_id, String latitude, String longitude, String hotel_id, String status) {
        this.user_id = user_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.hotel_id = hotel_id;
        this.status = status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TripsByUser{" +
                "user_id='" + user_id + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", hotel_id='" + hotel_id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
