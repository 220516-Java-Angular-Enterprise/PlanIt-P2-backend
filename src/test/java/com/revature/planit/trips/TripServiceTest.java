package com.revature.planit.trips;

import com.revature.planit.login.dtos.requests.LoginRequest;
import com.revature.planit.trips.dtos.requests.NewTripRequest;
import com.revature.planit.user.User;
import com.revature.planit.user.UserRepository;
import com.revature.planit.util.custom_exceptions.InvalidRequestException;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TripServiceTest extends TestCase {
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
//        Assert.assertThrows(InvalidRequestException.class, () -> tripService.saveTrip(tripRequest));
//    }

    public void testGetAllTrips() {
        tripRepository = mock(TripRepository.class);
        userRepository = mock(UserRepository.class);
        tripService = new TripService(tripRepository,userRepository);
        List<Trips> trips1 = Arrays.asList(trips);
        when(tripService.getAllTrips()).thenReturn(trips1);
        Assert.assertEquals(tripService.getAllTrips(),trips1);
    }

    public void testGetSavedTrips() {
        tripRepository = mock(TripRepository.class);
        userRepository = mock(UserRepository.class);
        tripService = new TripService(tripRepository,userRepository);
        List<Trips>tripsSaved = Arrays.asList(trips);
        when(tripService.getSavedTripsByUserId("q")).thenReturn(tripsSaved);
        Assert.assertEquals(tripService.getSavedTripsByUserId("q"),tripsSaved);
    }

    public void testGetAllTripByUserID() {
        tripRepository = mock(TripRepository.class);
        userRepository = mock(UserRepository.class);
        tripService = new TripService(tripRepository,userRepository);
        List<Trips> allTrips = Arrays.asList(trips);
        when(tripService.getAllTripsByUser("q")).thenReturn(allTrips);
        Assert.assertEquals(tripService.getAllTripsByUser("q"),allTrips);
    }
}