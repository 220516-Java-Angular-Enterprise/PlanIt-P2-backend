package com.revature.planit.dayplan.dtos.requests;

public class UpdateCategoryRequest {
    private String category;
    private String dayplan_id;

    public UpdateCategoryRequest(String category, String dayplan_id) {
        this.category = category;
        this.dayplan_id = dayplan_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDayplan_id() {
        return dayplan_id;
    }

    public void setDayplan_id(String dayplan_id) {
        this.dayplan_id = dayplan_id;
    }

    @Override
    public String toString() {
        return "UpdateCategoryRequest{" +
                "category='" + category + '\'' +
                ", dayplan_id='" + dayplan_id + '\'' +
                '}';
    }
}
