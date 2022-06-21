package com.revature.planit.trips;

import com.revature.planit.trips.dtos.requests.NewTripRequest;
import com.revature.planit.trips.dtos.requests.UpdateDestinationRequest;
import com.revature.planit.trips.dtos.requests.UpdateHotelRequest;
import com.revature.planit.trips.dtos.requests.UpdateTripStatusRequest;
import com.revature.planit.trips.dtos.responses.TripsByUser;
import com.revature.planit.util.annotations.Inject;
import com.revature.planit.util.custom_exceptions.InvalidRequestException;
import com.revature.planit.util.custom_exceptions.ResourceConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/trips")
public class TripsController{
    @Inject
    private final TripService tripService;

    @Inject
    @Autowired
    public TripsController(TripService tripService) {
        this.tripService = tripService;
    }

    /// POST REQUEST
    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String saveTrip(@RequestBody NewTripRequest request) {
        return tripService.saveTrip(request).getId();
    }

    /// UPDATE REQUESTS

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping("/updateDestination")
    @PutMapping
    public @ResponseBody Trips updateDestination(@RequestBody UpdateDestinationRequest request){
        tripService.updateDestination(request.getDestination(),request.getTrip_id());
        return updateDestination(request);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping("/updateStatus")
    @PutMapping
    public @ResponseBody Trips updateStatus(@RequestBody UpdateTripStatusRequest request){
        tripService.updateStatus(request);
        return updateStatus(request);
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping("/updateHotel")
    @PutMapping
    public @ResponseBody Trips updateHotel(@RequestBody UpdateHotelRequest request){
        tripService.updateHotel(request.getHotel(), request.getTrip_id());
        return updateHotel(request);
    }

    /// GET TRIP LISTS
    @CrossOrigin
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Trips> getAllTrips() {
        return tripService.getAllTrips();
    }

    @CrossOrigin
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Trips> getTripByUser(TripsByUser response){
        return tripService.getAllTripsByUser(response.getUser_id());
    }

    @CrossOrigin
    @GetMapping(value = "/{status}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Trips> getFavoriteByUser(TripsByUser response){
        return tripService.getSavedTripsByUserId(response.getUser_id());
    }


    /// EXCEPTION HANDLES
    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    public @ResponseBody Map<String, Object> handleResourceConflictException(ResourceConflictException e) {
        Map<String, Object> responseBody = new LinkedHashMap<>();
        responseBody.put("status", 409);
        responseBody.put("message", e.getMessage());
        responseBody.put("timestamp", LocalDateTime.now().toString());
        return responseBody;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody Map<String, Object> handleBadRequestException(InvalidRequestException e) {
        Map<String, Object> responseBody = new LinkedHashMap<>();
        responseBody.put("status", 400);
        responseBody.put("message", e.getMessage());
        responseBody.put("timestamp", LocalDateTime.now().toString());
        return responseBody;
    }
}

