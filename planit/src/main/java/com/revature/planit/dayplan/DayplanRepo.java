package com.revature.planit.dayplan;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayplanRepo extends CrudRepository<Dayplan,String> {
Dayplan findDayPlanById(String id);
@Modifying
@Query(value = "INSERT INTO dayplan(id,day_of_trip,day_activity,night_activity,restaurant,category)VALUES(?1,?2,?3,?4,?5,?6)",nativeQuery = true)
void saveDayPlan(String id,int day_of_trip,String day_activity, String night_activity,String restaurant, String category);

    void deleteDayPlanById(String id);
//this updates the activities,restaurants and categories
@Modifying
@Query(value="UPDATE dayplan SET day_activity =?1 WHERE dayplan_id=?2",nativeQuery = true)
    void updateDayActivity(String day_activity,String id);

@Modifying
@Query(value = "UPDATE dayplan SET night_activity = ?1 WHERE dayplan_id =?2",nativeQuery = true)
    void updateNightActivity(String night_activity,String id);

@Modifying
@Query(value = "UPDATE dayplan SET restaurant = ?1 WHERE dayplan_id = ?2",nativeQuery = true)
    void updateRestaurant(String restaurant,String id);
@Modifying
@Query(value="UPDATE dayplan SET category = ?1 WHERE dayplan_id=?2",nativeQuery = true)
    void updateCategory(String category, String id);
}
