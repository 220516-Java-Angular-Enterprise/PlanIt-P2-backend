package com.revature.planit.trips;

import com.revature.planit.trips.dtos.requests.NewTripRequest;
import com.revature.planit.util.annotations.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TripService {
    @Inject
    private final TripRepository tripRepo;

    @Inject
    @Autowired
    public TripService(TripRepository tripRepo) {
        this.tripRepo = tripRepo;
    }

    //need to add more information in order to save new trip
    //can add more when model is done
    public Trips saveTrip(NewTripRequest tripRequest){
        Trips trips = new Trips(tripRequest.getHotel(), tripRequest.getNight_activity(), tripRequest.getDay_activity(), tripRequest.getFood());

        //tripRepo.saveTrip(tripRequest.getDay_activity(),tripRequest.getHotel(),tripRequest.getNight_activity(),tripRequest.getFood());
        return trips;
    }

    public List<Trips> getAllTripsByUser(String user_id){
        return (List<Trips>) tripRepo.getAllTripsByUserId(user_id);
    }

    public List<Trips> getSavedTripsByUserId(String user_id){
        return (List<Trips>) tripRepo.getSavedTripsByUserID(user_id);
    }

//    public void updateTripActivities(String day_activity, String night_activity, String food, String trip_id){
//        tripRepo.updateTripActivities(day_activity, night_activity, food, trip_id);
//    }
//    public void updateTripDayActivities(String day_activity,String trip_id){
//        tripRepo.updateTripDayActivities(day_activity,trip_id);
//    }
//    public void updateTripNightActivities(String night_activity, String trip_id){
//        tripRepo.updateTripNightActivities(night_activity,trip_id);
//    }
//    public void updateTripFoodActivities(String food, String trip_id){
//        tripRepo.updateTripFoodActivities(food,trip_id);
//    }
//    public void updateHotel(String hotel, String trip_id){
//        tripRepo.updateTripHotel(hotel,trip_id);
//    }


}
