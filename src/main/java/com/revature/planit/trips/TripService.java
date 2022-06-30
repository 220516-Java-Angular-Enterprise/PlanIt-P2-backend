package com.revature.planit.trips;

import com.revature.planit.dayplan.DayPlanService;
import com.revature.planit.dayplan.DayplanRepo;
import com.revature.planit.trips.dtos.requests.NewTripRequest;
import com.revature.planit.user.UserRepository;
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
    private final UserRepository userRepo;
    private final DayplanRepo dayplanRepo;


    @Inject
    @Autowired
    public TripService(TripRepository tripRepo, UserRepository userRepo, DayplanRepo dayplanRepo) {
        this.tripRepo = tripRepo;
        this.userRepo = userRepo;
        this.dayplanRepo =dayplanRepo;
    }

    //need to add more information in order to save new trip
    //can add more when model is done
    public Trips saveTrip(NewTripRequest tripRequest){
        Trips trips = new Trips(UUID.randomUUID().toString(),tripRequest);
        trips.setId(UUID.randomUUID().toString());
        //trips.setUser(userRepo.findUserById(tripRequest.getUser_id()));
        //trips.setDayplan(dayplanRepo.findDayPlanById(tripRequest.getDayPlan_id()));
        trips.setStatus("CREATED");
        tripRepo.saveTrip(trips.getId(),tripRequest.getLatitude(),
                tripRequest.getLongitude(),tripRequest.getHotel(),
                tripRequest.getHotel_id(),trips.getStatus(),
                tripRequest.getUser_id(),
                tripRequest.getDayPlan_id());
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
    public void updateDestination(String latitude, String longitude, String trip_id){
        tripRepo.updateDestination(latitude,longitude,trip_id);
    }
    public void updateStatus(String status, String trip_id){
        tripRepo.updateStatus(status, trip_id);
    }
}
