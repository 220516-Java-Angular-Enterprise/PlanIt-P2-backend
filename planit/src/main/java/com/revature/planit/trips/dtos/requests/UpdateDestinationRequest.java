package com.revature.planit.trips.dtos.requests;

public class UpdateDestinationRequest {
    private String destination;
    private String trip_id;

    public UpdateDestinationRequest(String destination, String trip_id) {
        this.destination = destination;
        this.trip_id = trip_id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(String trip_id) {
        this.trip_id = trip_id;
    }

    @Override
    public String toString() {
        return "UpdateDestinationRequest{" +
                "destination='" + destination + '\'' +
                ", trip_id='" + trip_id + '\'' +
                '}';
    }
}
