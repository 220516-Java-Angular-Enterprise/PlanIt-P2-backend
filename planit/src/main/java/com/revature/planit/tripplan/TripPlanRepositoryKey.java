//package com.revature.planit.tripplan;
//
//import javax.persistence.Column;
//import java.io.Serializable;
//import java.util.Objects;
//
//public class TripPlanRepositoryKey implements Serializable {
//    @Column(name="trip_id")
//    private String trip_id;
//    @Column (name="dayplan_id")
//    private String dayplan_id;
//
//    public TripPlanRepositoryKey() {
//    }
//
//    public TripPlanRepositoryKey(String trip_id, String dayplan_id) {
//        this.trip_id = trip_id;
//        this.dayplan_id = dayplan_id;
//    }
//
//    public String getTrip_id() {
//        return trip_id;
//    }
//
//    public void setTrip_id(String trip_id) {
//        this.trip_id = trip_id;
//    }
//
//    public String getDayplan_id() {
//        return dayplan_id;
//    }
//
//    public void setDayplan_id(String dayplan_id) {
//        this.dayplan_id = dayplan_id;
//    }
//
//    @Override
//    public String toString() {
//        return "TripPlanRepositoryKey{" +
//                "trip_id='" + trip_id + '\'' +
//                ", dayplan_id='" + dayplan_id + '\'' +
//                '}';
//    }
//}
