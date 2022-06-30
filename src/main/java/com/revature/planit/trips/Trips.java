


package com.revature.planit.trips;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.revature.planit.dayplan.Dayplan;
import com.revature.planit.trips.dtos.requests.NewTripRequest;
import com.revature.planit.user.User;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "trip")

public class Trips {
    @Id
    private String id;

    @Column(name="latitude",nullable = false)
    private String latitude;

    @Column(name="longitude",nullable = false)
    private String longitude;
    @Column(name="hotel",nullable = false)
    private String hotel;
    @Column(name="hotel_ID",nullable = false)
    private String hotel_ID;
    @Column(name = "status")
    private String status;

    @ManyToMany
    @JoinTable(
            name = "tripPlan",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = @JoinColumn(name = "dayplan_id")
    )
    private List <Dayplan> tripPlanList;
    @ManyToOne
    @JoinColumn(name="dayplan_id",nullable=false)
    @JsonBackReference
    private  Dayplan dayplan;
    @ManyToOne
    @JoinColumn(name="user_id",nullable=false)
    @JsonBackReference
    private User user;

    public Trips() {
    }

    public Trips(String id, String hotel, String status, Dayplan dayplan, User user) {
        this.id = id;
        this.hotel = hotel;
        this.status = status;
        this.dayplan = dayplan;
        this.user = user;
    }



    public Trips(String hotel, String latitude, String status) {
        this.latitude = latitude;
        this.hotel = hotel;
        this.status = status;
    }

    public Trips(String id, NewTripRequest tripRequest) {
        this.id=id;
        this.hotel=tripRequest.getHotel();
        this.latitude=tripRequest.getLatitude();
        this.longitude= tripRequest.getLongitude();

    }

    public Trips(String id, String latitude, String longitude, String hotel, String hotel_ID, String status,
                 List<Dayplan> tripPlanList, Dayplan dayplan, User user) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.hotel = hotel;
        this.hotel_ID = hotel_ID;
        this.status = status;
        this.tripPlanList = tripPlanList;
        this.dayplan = dayplan;
        this.user = user;
    }

    public Trips(String hotel, String latitude, String longitude, String status) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.hotel = hotel;
        this.status = status;
    }

    public List<Dayplan> getTripPlanList() {
        return tripPlanList;
    }

    public void setTripPlanList(List<Dayplan> tripPlanList) {
        this.tripPlanList = tripPlanList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getHotel_ID() {
        return hotel_ID;
    }

    public void setHotel_ID(String hotel_ID) {
        this.hotel_ID = hotel_ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Dayplan getDayplan() {
        return dayplan;
    }

    public void setDayplan(Dayplan dayplan) {
        this.dayplan = dayplan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trips trips = (Trips) o;
        return Objects.equals(id, trips.id) && Objects.equals(latitude, trips.latitude) && Objects.equals(longitude, trips.longitude) && Objects.equals(hotel, trips.hotel) && Objects.equals(hotel_ID, trips.hotel_ID) && Objects.equals(status, trips.status) && Objects.equals(dayplan, trips.dayplan) && Objects.equals(user, trips.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, latitude, longitude, hotel, hotel_ID, status, dayplan, user);
    }

    @Override
    public String toString() {
        return "Trips{" +
                "id='" + id + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", hotel='" + hotel + '\'' +
                ", hotel_ID='" + hotel_ID + '\'' +
                ", status='" + status + '\'' +
                ", tripPlanList=" + dayplan +
                ", user=" + user +
                '}';
    }
}







