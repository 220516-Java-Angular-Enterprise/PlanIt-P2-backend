package com.revature.planit.dayplan.dtos.requests;

public class UpdateNightActivityRequest {
    private String night_activity;
    private String dayplan_id;

    public UpdateNightActivityRequest(String night_activity, String dayplan_id) {
        this.night_activity = night_activity;
        this.dayplan_id = dayplan_id;
    }

    public String getNight_activity() {
        return night_activity;
    }

    public void setNight_activity(String night_activity) {
        this.night_activity = night_activity;
    }

    public String getDayplan_id() {
        return dayplan_id;
    }

    public void setDayplan_id(String dayplan_id) {
        this.dayplan_id = dayplan_id;
    }

    @Override
    public String toString() {
        return "UpdateNightActivityRequest{" +
                "night_activity='" + night_activity + '\'' +
                ", dayplan_id='" + dayplan_id + '\'' +
                '}';
    }
}
