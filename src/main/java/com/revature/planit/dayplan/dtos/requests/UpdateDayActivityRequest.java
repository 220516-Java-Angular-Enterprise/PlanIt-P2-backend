package com.revature.planit.dayplan.dtos.requests;

public class UpdateDayActivityRequest {
    private String day_activity;
    private String dayplan_id;

    public UpdateDayActivityRequest(String day_activity, String dayplan_id) {
        this.day_activity = day_activity;
        this.dayplan_id = dayplan_id;
    }



    public String getDay_activity() {
        return day_activity;
    }

    public void setDay_activity(String day_activity) {
        this.day_activity = day_activity;
    }

    public String getDayplan_id() {
        return dayplan_id;
    }

    public void setDayplan_id(String dayplan_id) {
        this.dayplan_id = dayplan_id;
    }

    @Override
    public String toString() {
        return "UpdateDayActivityRequest{" +
                "day_activity='" + day_activity + '\'' +
                ", dayplan_id='" + dayplan_id + '\'' +
                '}';
    }


}
