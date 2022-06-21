package com.revature.planit.tripplan;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.revature.planit.dayplan.Dayplan;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tripplan")
public class TripPlan {
    @ManyToOne()
    @JoinColumn(name="trip_id",nullable = false)
    @JsonBackReference
    private Trip trip;
    @ManyToOne()
    @JoinColumn(name="dayplan_id",nullable = false)
    @JsonBackReference
    private Dayplan dayplan;

    public TripPlan() {
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Dayplan getDayplan() {
        return dayplan;
    }

    public void setDayplan(Dayplan dayplan) {
        this.dayplan = dayplan;
    }

    @Override
    public String toString() {
        return "TripPlan{" +
                "trip=" + trip +
                ", dayplan=" + dayplan +
                '}';
    }
}
