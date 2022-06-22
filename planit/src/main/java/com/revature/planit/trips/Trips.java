


package com.revature.planit.trips;
import com.revature.planit.dayplan.Dayplan;
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
    @Column(name="destination",nullable = false)
    private String destination;
    @Column(name="hotel",nullable = false)
    private String hotel;

    @Column(name = "status")
    private String status;

    @ManyToMany
    @JoinTable(
            name = "tripPlan",
            joinColumns = @JoinColumn(name = "dayplan_id"),
            inverseJoinColumns = @JoinColumn(name = "trip_id")
    )
    private List<Dayplan> tripPlanList;

    @ManyToOne
    @JoinColumn(name="user_id",nullable=false)
    private User user;

    public Trips() {
    }

    public Trips(String id, String destination, String hotel, String status, List<Dayplan> tripPlanList, User user) {
        this.id = id;
        this.destination = destination;
        this.hotel = hotel;
        this.status = status;
        this.tripPlanList = tripPlanList;
        this.user = user;
    }

    public Trips(String hotel, String destination, String status) {
        this.destination = destination;
        this.hotel = hotel;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Dayplan> getTripPlanList() {
        return tripPlanList;
    }

    public void setTripPlanList(List<Dayplan> tripPlanList) {
        this.tripPlanList = tripPlanList;
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
        return Objects.equals(id, trips.id) && Objects.equals(destination, trips.destination) && Objects.equals(hotel, trips.hotel) && Objects.equals(status, trips.status) && Objects.equals(tripPlanList, trips.tripPlanList) && Objects.equals(user, trips.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, destination, hotel, status, tripPlanList, user);
    }

    @Override
    public String toString() {
        return "Trips{" +
                "id='" + id + '\'' +
                ", destination='" + destination + '\'' +
                ", hotel='" + hotel + '\'' +
                ", status='" + status + '\'' +
                ", tripPlanList=" + tripPlanList +
                ", user=" + user +
                '}';
    }
}







