package com.revature.planit.trips;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepository extends CrudRepository<Trips, String> {
    @Modifying
    @Query(value = "INSERT INTO trip (id, latitude, longitude, hotel, hotel_id, status, user_id, dayPlan_id) VALUES(?1,?2,?3,?4,?5,?6,?7,?8)", nativeQuery = true)
    void saveTrip(String id, String latitude, String longitude, String hotel, String hotel_id, String status , String user_id, String dayPlan_id);

    //this is to update the parts of their trip
    @Modifying
    @Query(value = "UPDATE trip SET latitude = ?1, longitude =?3 WHERE id= ?2", nativeQuery = true)
    void updateDestination(String latitude, String longitude, String id);
    @Modifying
    @Query(value = "UPDATE trip SET hotel = ?1 WHERE id= ?2", nativeQuery = true)
    void updateHotel(String hotel, String id);
    //this would be so they can save this trip as one of their favorites
    @Modifying
    @Query(value = "UPDATE trip SET status = ?1 WHERE id= ?2", nativeQuery = true)
    void updateStatus(String status, String id);

    @Query(value = "SELECT * FROM trip WHERE user_id=?", nativeQuery = true)
    List<Trips> getAllTripsByUserId(String user_id);

    @Query(value = "SELECT * FROM trip", nativeQuery = true)
    List<Trips> getAllTrips();

    //not sure if we will add status of the given itinerary,
    // but if we do, maybe we would have "saved", "favorite","pending"
    @Query(value = "SELECT * FROM trip WHERE status ='CREATED' AND user_id = ?", nativeQuery = true)
    List<Trips> getSavedTripsByUserID(String user_id);

}
