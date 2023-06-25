package services;

public class ActivitiesService {

    public static final String BASE_URL = "https://fakerestapi.azurewebsites.net";
    public static final String GET_ACTIVITIES = BASE_URL + "/api/v1/Activities";
    public static final String POST_ACTIVITY = BASE_URL + "/api/v1/Activities";
    public static final String GET_ACTIVITY_BY_ID = BASE_URL + "/api/v1/Activities/{id}";
    public static final String DELETE_ACTIVITY_BY_ID = BASE_URL + "/api/v1/Activities/{id}";

    /**
     * Gets the endpoint for deleting a specific activity.
     *
     * @param activityId The ID of the activity to delete.
     * @return The delete activity endpoint.
     */
    public static String getDeleteActivityEndpoint(String activityId) {
        return DELETE_ACTIVITY_BY_ID.replace("{id}", activityId);
    }

    /**
     * Gets the endpoint for updating a specific activity.
     *
     * @param activityId The ID of the activity to update.
     * @return The update activity endpoint.
     */
    public static String getUpdateActivityEndpoint(String activityId) {
        return GET_ACTIVITY_BY_ID.replace("{id}", activityId);
    }
}
