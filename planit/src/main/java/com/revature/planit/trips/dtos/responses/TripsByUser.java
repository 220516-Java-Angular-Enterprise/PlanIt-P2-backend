package com.revature.planit.trips.dtos.responses;

public class TripsByUser {
    private String user_id;
    private String destination;
    private String hotel;
    private String status;

    public TripsByUser(String user_id, String destination, String hotel, String status) {
        this.user_id = user_id;
        this.destination = destination;
        this.hotel = hotel;
        this.status = status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    @Override
    public String toString() {
        return "TripsByUser{" +
                "user_id='" + user_id + '\'' +
                ", destination='" + destination + '\'' +
                ", hotel='" + hotel + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
