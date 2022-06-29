package com.revature.planit.dayplan;

import com.revature.planit.dayplan.dtos.requests.*;
import com.revature.planit.util.annotations.Inject;
import com.revature.planit.util.custom_exceptions.InvalidRequestException;
import com.revature.planit.util.custom_exceptions.ResourceConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/dayplan")
public class DayPlanController {
    @Inject
    private final DayPlanService dayPlanService;

    @Inject
    @Autowired
    public DayPlanController(DayPlanService dayPlanService) {
        this.dayPlanService = dayPlanService;
    }

    @CrossOrigin
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Dayplan> getAllDayPlans() {
        return dayPlanService.getAllDayPlans();
    }

    @CrossOrigin
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<Dayplan> getDayplanById(@PathVariable String id) {
        return dayPlanService.getDayPlanById(id);
    }

    @CrossOrigin
    @PostMapping(consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String createNewDayPlan(@RequestBody NewDayPlanRequest request) {
        return dayPlanService.createdNewDayPlan(request).getId();
    }

    @CrossOrigin
    @PutMapping("/update")
    public ResponseEntity<Dayplan> updateDayPlan(@RequestBody Dayplan dayplan) {
        Dayplan updateDayPlan = dayPlanService.updateDayPlan(dayplan);
        return new ResponseEntity<>(updateDayPlan, HttpStatus.OK);
    }

    //Update Requests
 @ResponseStatus(HttpStatus.ACCEPTED)
  @RequestMapping(value = "/{id}/day_activity", method = RequestMethod.PUT)
@PutMapping
    public @ResponseBody void updateDayActivity(@RequestBody UpdateDayActivityRequest request, @PathVariable String id) {
      dayPlanService.updateDayActivity(request.getDay_activity(), id);

   }

 @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/{id}/night_activity", method = RequestMethod.PUT)
    @PutMapping
    public @ResponseBody void updateNightActivity(@RequestBody UpdateNightActivityRequest request, @PathVariable String id) {
      dayPlanService.updateNightActivity(request.getNight_activity(), id);

  }

   @ResponseStatus(HttpStatus.ACCEPTED)
  @RequestMapping(value = "/{id}/restaurant", method = RequestMethod.PUT)
   @PutMapping
  public @ResponseBody void updateRestaurant(@RequestBody UpdateRestaurantRequest request ,@PathVariable String id) {
     dayPlanService.updateRestaurant(request.getRestaurant(), id);

    }

  @ResponseStatus(HttpStatus.ACCEPTED)
   @RequestMapping(value = "/{id}/category ", method = RequestMethod.PUT)
  @PutMapping
 public @ResponseBody void updateCategory(@RequestBody UpdateCategoryRequest request, @PathVariable String id) {
      dayPlanService.updateCategory(request.getCategory(), id);

   }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDayPlan(@PathVariable("id") String id) {
        dayPlanService.deleteDayPlan(id);
        return new ResponseEntity<>(HttpStatus.OK);

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



