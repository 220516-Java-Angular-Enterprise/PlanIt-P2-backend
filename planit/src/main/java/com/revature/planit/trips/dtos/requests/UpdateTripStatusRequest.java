package com.revature.planit.trips.dtos.requests;

public class UpdateTripStatusRequest {
    private String trip_id;
    private String status;

    private UpdateTripStatusRequest(){}

    public UpdateTripStatusRequest(String trip_id, String status) {
        this.trip_id = trip_id;
        this.status = status;
    }

    public String getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(String trip_id) {
        this.trip_id = trip_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UpdateTripStatusRequest{" +
                "trip_id='" + trip_id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
