package com.revature.planit;

import com.revature.planit.trips.TripRepository;
import com.revature.planit.trips.TripService;
import com.revature.planit.trips.Trips;
import com.revature.planit.trips.dtos.requests.NewTripRequest;
import com.revature.planit.user.UserRepository;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class TripTests extends TestCase {
    private TripService tripService;
    private TripRepository tripRepo;
    private UserRepository userRepo;
    NewTripRequest newTripRequestMock = new NewTripRequest();
    Trips tripsMock = new Trips();


    @Before
    public void setup(){
        tripRepo = mock(TripRepository.class);
        userRepo = mock(UserRepository.class);
        tripService = new TripService(tripRepo,userRepo);
    }

    public void testGetTripsByUser(){

    }

    public void testGetAllSavedTrips(){

    }
    public void testSaveNewTrip(){

    }

}
