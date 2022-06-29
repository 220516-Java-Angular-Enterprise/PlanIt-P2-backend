package com.revature.planit.dayplan;

import com.revature.planit.dayplan.dtos.requests.NewDayPlanRequest;
import junit.framework.TestCase;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DayplanRepoTest extends TestCase {
    private Dayplan dayplan;
    private DayPlanService dayPlanService;
    private DayplanRepo dayplanRepo;
    private NewDayPlanRequest dayPlanRequest;

    public void testFindDayPlanById() {
        dayplanRepo = mock(DayplanRepo.class);
        dayPlanService = new DayPlanService(dayplanRepo);
        dayplan = new Dayplan();
        when(dayplanRepo.findDayPlanById("id")).thenReturn(dayplan);
        assertEquals(dayplanRepo.findDayPlanById("id"),dayplan);
    }

//    public void testSaveDayPlan() {
//        dayplanRepo = mock(DayplanRepo.class);
//        dayPlanService = new DayPlanService(dayplanRepo);
//
//    }
//
//    public void testUpdateDayActivity() {
//        dayplanRepo = mock(DayplanRepo.class);
//        dayPlanService = new DayPlanService(dayplanRepo);
//    }
//
//    public void testUpdateNightActivity() {
//        dayplanRepo = mock(DayplanRepo.class);
//        dayPlanService = new DayPlanService(dayplanRepo);
//    }
//
//    public void testUpdateRestaurant() {
//        dayplanRepo = mock(DayplanRepo.class);
//        dayPlanService = new DayPlanService(dayplanRepo);
//    }
//
//    public void testUpdateCategory() {
//        dayplanRepo = mock(DayplanRepo.class);
//        dayPlanService = new DayPlanService(dayplanRepo);
//    }
}