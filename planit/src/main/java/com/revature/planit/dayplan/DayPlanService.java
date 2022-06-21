package com.revature.planit.dayplan;

import com.revature.planit.dayplan.dtos.NewDayPlanRequest;
import com.revature.planit.util.annotations.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DayPlanService {
    @Inject
    private final DayplanRepo dayplanRepo;

    @Inject
    @Autowired
    public DayPlanService(DayplanRepo dayplanRepo){
        this.dayplanRepo=dayplanRepo;
    }
    public List<Dayplan> getAllDayPlans(){
        return (List<Dayplan>) dayplanRepo.findAll();
    }
    public Optional<Dayplan>getDayPlanById(String id){
        return dayplanRepo.findById(id);
    }
    public String createdNewDayPlan(NewDayPlanRequest request){
        Dayplan dayplan = new Dayplan(UUID.randomUUID().toString(),request);
        dayplanRepo.save(dayplan);
        return dayplan.getId();
    }

}
