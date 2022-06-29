package com.revature.planit.trips.dtos.requests;

public class UpdateDestinationRequest {
    private String latitude;
    private String longitude;
    private String trip_id;

    public UpdateDestinationRequest(String latitude, String longitude, String trip_id) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.trip_id = trip_id;
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

    public String getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(String trip_id) {
        this.trip_id = trip_id;
    }

    @Override
    public String toString() {
        return "UpdateDestinationRequest{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", trip_id='" + trip_id + '\'' +
                '}';
    }
}
