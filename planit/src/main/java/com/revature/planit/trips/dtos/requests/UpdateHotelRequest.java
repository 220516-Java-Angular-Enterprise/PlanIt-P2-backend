package com.revature.planit.trips.dtos.requests;

public class UpdateHotelRequest {
    private String hotel;
    private String trip_id;

    public UpdateHotelRequest(String hotel, String trip_id) {
        this.hotel = hotel;
        this.trip_id = trip_id;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(String trip_id) {
        this.trip_id = trip_id;
    }

    @Override
    public String toString() {
        return "UpdateHotelRequest{" +
                "hotel='" + hotel + '\'' +
                ", trip_id='" + trip_id + '\'' +
                '}';
    }
}
