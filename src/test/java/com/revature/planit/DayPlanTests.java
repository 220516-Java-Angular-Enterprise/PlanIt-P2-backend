package com.revature.planit;

import com.revature.planit.dayplan.DayPlanService;
import com.revature.planit.dayplan.Dayplan;
import com.revature.planit.dayplan.DayplanRepo;
import com.revature.planit.dayplan.dtos.requests.NewDayPlanRequest;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DayPlanTests extends TestCase {
    private DayplanRepo dayplanRepoMock;
    private DayPlanService dayPlanService;

    Dayplan dayplan = new Dayplan();
    NewDayPlanRequest dayPlanRequestMock =new NewDayPlanRequest();

    @Before
    public void setup(){
        dayplanRepoMock = mock(DayplanRepo.class);
        dayPlanService = new DayPlanService(dayplanRepoMock);
    }

    @Test
    public void testGetDayPlanById(){
        when(dayplanRepoMock.findDayPlanById("id")).thenReturn(dayplan);
        assertEquals(dayplanRepoMock.findDayPlanById("id"),dayplan);
    }

    public void testNewDayPlan(){

    }

    public void testGetAllDayPlans(){

    }


}
