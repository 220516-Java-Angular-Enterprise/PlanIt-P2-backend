package com.revature.planit.dayplan;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayplanRepo extends CrudRepository<Dayplan,String> {

}
