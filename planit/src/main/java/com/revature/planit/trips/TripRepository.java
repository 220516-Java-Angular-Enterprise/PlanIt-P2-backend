package com.revature.planit.trips;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepository extends CrudRepository<Trips, String> {
    @Modifying
    @Query(value = "INSERT INTO trip VALUES(?,?,?,?,?,?,?)", nativeQuery = true)
    void saveTrip(String id,String user_id, String category_id, String hotel,
                  String day_activity, String night_activity, String food);
    //this is to update the activities that the user did not like

    @Modifying
    @Query(value = "UPDATE trip SET day_activity = ?1, night_activity = ?2, food = ?3 WHERE trip_id= ?4", nativeQuery = true)
    void updateTripActivities(String day_activity, String night_activity, String food, String id);

    //here are specific updates for each suggestion
    @Modifying
    @Query(value = "UPDATE trip SET day_activity = ?1 WHERE trip_id= ?2", nativeQuery = true)
    void updateTripDayActivities(String day_activity, String id);

    @Modifying
    @Query(value = "UPDATE trip SET night_activity = ?1 WHERE trip_id= ?2", nativeQuery = true)
    void updateTripNightActivities(String night_activity, String id);

    @Modifying
    @Query(value = "UPDATE trip SET food = ?1 WHERE trip_id= ?2", nativeQuery = true)
    void updateTripFoodActivities(String food, String id);

    @Modifying
    @Query(value = "UPDATE trip SET hotel = ?1 WHERE trip_id= ?2", nativeQuery = true)
    void updateTripHotel(String hotel, String id);

    @Query(value = "SELECT * FROM trip WHERE user_id=?", nativeQuery = true)
    List<Trips> getAllTripsByUserId(String user_id);

    //not sure if we will add status of the given itinerary,
    // but if we do, maybe we would have "saved", "favorite","pending"
    @Query(value = "SELECT * FROM trip WHERE status ='saved' AND user_id = ?", nativeQuery = true)
    List<Trips> getSavedTripsByUserID(String user_id);






}
