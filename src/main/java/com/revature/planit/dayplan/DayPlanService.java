package com.revature.planit.dayplan;

import com.revature.planit.dayplan.dtos.requests.NewDayPlanRequest;
import com.revature.planit.util.annotations.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
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
    public Dayplan createdNewDayPlan(NewDayPlanRequest request){
        Dayplan dayplan = new Dayplan(UUID.randomUUID().toString(),request);
        dayplan.setId(UUID.randomUUID().toString());
        dayplanRepo.saveDayPlan(dayplan.getId(),request.getDay_of_trip(),
                request.getDay_activity(),request.getDay_activity_id(),
                request.getNight_activity(), request.getNight_activity_id(),
                request.getRestaurant(), request.getRestaurant_id(), request.getCategory());
        return dayplan;
    }

    public Dayplan updateDayPlan(Dayplan dayplan) {
        return dayplanRepo.save(dayplan);
    }

    public void deleteDayPlan(String id) {
        dayplanRepo.deleteDayPlanById(id);
    }

    public void updateDayActivity(String day_activity, String id) {
        dayplanRepo.updateDayActivity(day_activity,id);
        
    }

    public void updateNightActivity(String night_activity, String id) {
        dayplanRepo.updateNightActivity(night_activity,id);
    }

    public void updateRestaurant(String restaurant, String id) {
        dayplanRepo.updateRestaurant(restaurant,id);
    }

    public void updateCategory(String category, String id) {
        dayplanRepo.updateCategory(category,id);
    }
}
