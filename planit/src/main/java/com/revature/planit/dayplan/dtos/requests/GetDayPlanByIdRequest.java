package com.revature.planit.dayplan.dtos.requests;

public class GetDayPlanByIdRequest {
    private String id;

    public GetDayPlanByIdRequest() {
    }

    public GetDayPlanByIdRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GetDayPlanByIdRequest{" +
                "id='" + id + '\'' +
                '}';
    }
}
