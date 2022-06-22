package com.revature.planit.trips;

import com.revature.planit.trips.dtos.requests.NewTripRequest;
import com.revature.planit.trips.dtos.requests.UpdateTripStatusRequest;
import com.revature.planit.util.annotations.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

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
        Trips trips = tripRequest.extractTrip();
        trips.setId(UUID.randomUUID().toString());
        tripRepo.saveTrip(trips.getId(),trips.getDestination(),trips.getHotel(),trips.getStatus(), String.valueOf(trips.getUser()));
       return trips;
    }

    public List<Trips> getAllTripsByUser(String user_id){
        return (List<Trips>) tripRepo.getAllTripsByUserId(user_id);
    }
    public List<Trips> getAllTrips(){return (List<Trips>) tripRepo.getAllTrips();}

    public List<Trips> getSavedTripsByUserId(String user_id){
        return (List<Trips>) tripRepo.getSavedTripsByUserID(user_id);
    }


    public void updateHotel(String hotel, String trip_id){
        tripRepo.updateHotel(hotel,trip_id);
    }
    public void updateDestination(String destination, String trip_id){
        tripRepo.updateDestination(destination,trip_id);
    }
    public void updateStatus(String status, String trip_id){
        tripRepo.updateStatus(status, trip_id);
    }

}
