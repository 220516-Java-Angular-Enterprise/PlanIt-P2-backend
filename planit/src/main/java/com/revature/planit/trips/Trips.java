package com.revature.planit.trips;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "trip")
public class Trips {
    public Trips(String hotel, String night_activity, String day_activity, String food) {
    }
}
