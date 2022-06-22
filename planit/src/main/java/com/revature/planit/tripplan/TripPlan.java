//package com.revature.planit.tripplan;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.revature.planit.dayplan.Dayplan;
//import com.revature.planit.trips.Trips;
//import org.springframework.data.repository.CrudRepository;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="tripplan")
//public class TripPlan {
//    @EmbeddedId
//TripPlanRepositoryKey id;
//    @ManyToOne()
//    @JoinColumn(name="trip_id",nullable = false)
//    @JsonBackReference
//    public Trips trip;
//
//    @ManyToOne()
//    @JoinColumn(name="dayplan_id",nullable = false)
//    @JsonBackReference
//    public Dayplan dayplan;
//
//    public TripPlan() {
//    }
//
//    public Trips getTrip() {
//        return trip;
//    }
//
//    public void setTrip(Trips trip) {
//        this.trip = trip;
//    }
//
//    public Dayplan getDayplan() {
//        return dayplan;
//    }
//
//    public void setDayplan(Dayplan dayplan) {
//        this.dayplan = dayplan;
//    }
//
//    @Override
//    public String toString() {
//        return "TripPlan{" +
//                "trip=" + trip +
//                ", dayplan=" + dayplan +
//                '}';
//    }
//}
