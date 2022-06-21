package com.revature.planit.trips;

import com.revature.planit.trips.dtos.requests.NewTripRequest;
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


    @CrossOrigin

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String register(@RequestBody NewTripRequest request) {
        return tripService.saveTrip(request).getId();
    }


    @CrossOrigin
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Trips> getAllTrips() {
        return tripService.getAllTrips();
    }




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

