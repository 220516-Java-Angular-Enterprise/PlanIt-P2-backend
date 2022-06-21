package com.revature.planit.dayplan;

import com.revature.planit.dayplan.dtos.NewDayPlanRequest;
import com.revature.planit.util.annotations.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dayplan")
public class DayPlanController {
    @Inject
    private final DayPlanService dayPlanService;

    @Inject
    @Autowired
    public DayPlanController(DayPlanService dayPlanService){
        this.dayPlanService=dayPlanService;
    }
    @CrossOrigin
    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Dayplan> getAllDayPlans(){
        return dayPlanService.getAllDayPlans();
    }
    @CrossOrigin
    @GetMapping(value="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<Dayplan> getDayplanById(@PathVariable String id) {
        return dayPlanService.getDayPlanById(id);
    }

    @CrossOrigin
    @PostMapping(consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String createNewDayPlan(NewDayPlanRequest request) {
        return dayPlanService.createdNewDayPlan(request);
    }


        }



