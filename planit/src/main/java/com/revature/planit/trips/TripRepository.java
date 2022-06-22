package com.revature.planit.trips;

import com.revature.planit.user.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepository extends CrudRepository<Trips, String> {
    @Modifying
    @Query(value = "INSERT INTO trip (id, destination, hotel, status, user_id),  VALUES(?,?,?,?,?,?)", nativeQuery = true)
    void saveTrip(String id, String destination, String hotel, String status , String user_id);

    //this is to update the parts of their trip
    @Modifying
    @Query(value = "UPDATE trip SET destination = ?1 WHERE trip_id= ?2", nativeQuery = true)
    void updateDestination(String destination, String id);
    @Modifying
    @Query(value = "UPDATE trip SET hotel = ?1 WHERE trip_id= ?2", nativeQuery = true)
    void updateHotel(String hotel, String id);
    //this would be so they can save this trip as one of their favorites
    @Modifying
    @Query(value = "UPDATE trip SET status = ?1 WHERE trip_id= ?2", nativeQuery = true)
    void updateStatus(String status, String id);

    @Query(value = "SELECT * FROM trip WHERE user_id=?", nativeQuery = true)
    List<Trips> getAllTripsByUserId(String user_id);

    @Query(value = "SELECT * FROM trip", nativeQuery = true)
    List<Trips> getAllTrips();

    //not sure if we will add status of the given itinerary,
    // but if we do, maybe we would have "saved", "favorite","pending"
    @Query(value = "SELECT * FROM trip WHERE status ='favorite' AND user_id = ?", nativeQuery = true)
    List<Trips> getSavedTripsByUserID(String user_id);

}
