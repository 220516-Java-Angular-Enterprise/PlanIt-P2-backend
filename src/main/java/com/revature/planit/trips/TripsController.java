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

    /// GET TRIP LISTS
    @CrossOrigin
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Trips> getAllTrips() {
        return tripService.getAllTrips();
    }

    // I don't think it needs the id mapping here -- please review
    @CrossOrigin
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Trips> getTripByUser(TripsByUser response){
        return tripService.getAllTripsByUser(response.getUser_id());
    }
    @CrossOrigin
    @GetMapping(value = "saved/{status}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Trips> getFavoriteByUser(TripsByUser response){
        return tripService.getSavedTripsByUserId(response.getUser_id());
    }

    /// PUT REQUESTS

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/{id}/destination", method = RequestMethod.PUT)
    @PutMapping public @ResponseBody void updateDestination(@RequestBody UpdateDestinationRequest request, @PathVariable String id){
        tripService.updateDestination(request.getDestination(),id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/{id}/status", method = RequestMethod.PUT)
    @PutMapping public @ResponseBody void updateStatus(@RequestBody UpdateTripStatusRequest request, @PathVariable String id){
        tripService.updateStatus(request.getStatus(),id );
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/{id}/hotel", method = RequestMethod.PUT)
    @PutMapping public @ResponseBody void updateHotel(@RequestBody UpdateHotelRequest request, @PathVariable String id){
        tripService.updateHotel(request.getHotel(), id);
    }

    //DELETE TRIP

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

