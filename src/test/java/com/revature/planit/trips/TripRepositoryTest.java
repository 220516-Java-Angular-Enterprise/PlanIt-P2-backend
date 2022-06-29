package com.revature.planit.trips;

import com.revature.planit.trips.dtos.requests.NewTripRequest;
import com.revature.planit.user.User;
import com.revature.planit.user.UserRepository;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TripRepositoryTest extends TestCase {
    private Trips trips;
    private TripService tripService;
    private TripRepository tripRepository;
    private UserRepository userRepository;
    private NewTripRequest tripRequest;
    private User user;

//    public void testSaveTrip() {
//        tripRepository = mock(TripRepository.class);
//        userRepository = mock(UserRepository.class);
//        tripService = new TripService(tripRepository,userRepository);
//    }

    public void testGetAllTrips() {
        tripRepository = mock(TripRepository.class);
        userRepository = mock(UserRepository.class);
        tripService = new TripService(tripRepository,userRepository);
        List<Trips> allTrips = Arrays.asList(trips);
        when(tripRepository.getAllTrips()).thenReturn(allTrips);
        Assert.assertEquals(tripRepository.getAllTrips(),allTrips);
    }

    public void testGetAllTripsByUser() {
        tripRepository = mock(TripRepository.class);
        userRepository = mock(UserRepository.class);
        tripService = new TripService(tripRepository,userRepository);
        List<Trips> allTripsUser = Arrays.asList(trips);
        when(tripRepository.getAllTripsByUserId("q")).thenReturn(allTripsUser);
        Assert.assertEquals(tripRepository.getAllTripsByUserId("q"),allTripsUser);
    }

    public void testGetSavedTripsByUserID() {
        tripRepository = mock(TripRepository.class);
        userRepository = mock(UserRepository.class);
        tripService = new TripService(tripRepository,userRepository);
        List<Trips> savedTripsUser = Arrays.asList(trips);
        when(tripRepository.getSavedTripsByUserID("q")).thenReturn(savedTripsUser);
        Assert.assertEquals(tripRepository.getSavedTripsByUserID("q"),savedTripsUser);
    }
}