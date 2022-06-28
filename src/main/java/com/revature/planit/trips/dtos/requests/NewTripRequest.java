package com.revature.planit.trips.dtos.requests;

import com.revature.planit.trips.Trips;

public class NewTripRequest {
    private String hotel;
    private String destination;
    private String status;
    private String user_id;

    public NewTripRequest(String hotel, String destination, String status, String user_id) {
        this.hotel = hotel;
        this.destination = destination;
        this.status = status;
        this.user_id = user_id;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public Trips extractTrip() {
        return new Trips(hotel,destination,status);
    }
    @Override
    public String toString() {
        return "NewTripRequest{" +
                "hotel='" + hotel + '\'' +
                ", destination='" + destination + '\'' +
                ", status='" + status + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
