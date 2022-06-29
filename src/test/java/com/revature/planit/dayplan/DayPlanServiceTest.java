package com.revature.planit.dayplan;

import com.revature.planit.dayplan.dtos.requests.NewDayPlanRequest;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DayPlanServiceTest extends TestCase {
    private Dayplan dayplan;
    private DayPlanService dayPlanService;
    private DayplanRepo dayplanRepo;
    private NewDayPlanRequest dayPlanRequest;


    public void testGetAllDayPlans() {
        dayplanRepo = mock(DayplanRepo.class);
        dayPlanService = new DayPlanService(dayplanRepo);
        List<Dayplan>dayplans= Arrays.asList(dayplan);
        when(dayPlanService.getAllDayPlans()).thenReturn(dayplans);
        Assert.assertEquals(dayPlanService.getAllDayPlans(),dayplans);
    }

//    public void testCreatedNewDayPlan() {
//        dayplanRepo = mock(DayplanRepo.class);
//        dayPlanService = new DayPlanService(dayplanRepo);
//
//    }
//
//    public void testGetAllByID() {
//        dayplanRepo = mock(DayplanRepo.class);
//        dayPlanService = new DayPlanService(dayplanRepo);
//    }
}