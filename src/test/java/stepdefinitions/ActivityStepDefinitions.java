package stepdefinitions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.ActivityDetails;
import org.testng.Assert;
import services.ActivitiesService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;


/**
 * This class is to define the Steps for Activities feature file.
 */
public class ActivityStepDefinitions {

    private Response response;
    private ActivityDetails createdActivity;
    private String specificActivityId;
    private ActivityDetails updatedActivity;

    private String postRequestBody = "{\"id\": 515," +
            " \"title\": \"string\"," +
            " \"dueDate\": \"2023-06-18T16:37:25.172Z\"," +
            " \"completed\": true}";


    private String updateRequestBody = "{\"id\": 514, " +
            "\"title\": \"Updated shahid\", \"dueDate\":" +
            " \"2023-06-18T16:37:25.172Z\", \"completed\": true}";

    /**
     * Sending a GET request to the Activities endpoint.
     */
    @When("Users Send a GET request to Activities endpoint")
    public void sendGetRequestToActivitiesEndpoint() {
        response = RestAssured.get(ActivitiesService.GET_ACTIVITIES);
    }

    /**
     * Verifying the response status code.
     *
     * @param statusCode The expected status code.
     */
    @Then("the response status code should be {int}")
    public void verifyResponseStatusCode(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    /**
     * Verifying that the response body contains a list of activities.
     */
    @Then("the response body should contain a list of activities")
    public void verifyResponseBodyContainsListOfActivities() {
        ActivityDetails[] activities = response.as(ActivityDetails[].class);
        assertNotNull(activities);
        Assert.assertFalse(activities.length == 0);
    }

    /**
     * Sending a POST request to the Activities endpoint.
     */
    @When("Users Send a POST request to Activities endpoint")
    public void sendPostRequestToActivitiesEndpoint() {
        response = given()
                .contentType(ContentType.JSON)
                .body(postRequestBody)
                .post(ActivitiesService.POST_ACTIVITY);

        createdActivity = response.as(ActivityDetails.class);
    }

    /**
     * Verifying that the response body contains the created activity details.
     */
    @Then("the response body should contain the created activity details")
    public void verifyResponseBodyContainsCreatedActivity() {
        assertEquals(515, createdActivity.getId());
        assertEquals("string", createdActivity.getTitle());
        assertEquals("2023-06-18T16:37:25.172Z", createdActivity.getDueDate());
        assertTrue(createdActivity.isCompleted());
    }

    /**
     * Sets the specific activity ID.
     *
     * @param activityId The ID of the specific activity.
     */
    @Given("the ID is {string}")
    public void setActivityId(String activityId) {
        specificActivityId = activityId;
    }

    /**
     * Sending a GET request to the specific Activity endpoint.
     */
    @When("Users Send a GET request to the specific Activity endpoint")
    public void sendGetRequestToSpecificActivityEndpoint() {
        String specificActivityEndpoint = ActivitiesService.GET_ACTIVITY_BY_ID.replace("{id}", specificActivityId);
        response = RestAssured.get(specificActivityEndpoint);
    }

    /**
     * Verifying that the response body contains the details of the specific Activity.
     */
    @Then("the response body should contain the details of the specific Activity")
    public void verifyResponseBodyContainsSpecificActivity() {
        ActivityDetails activity = response.getBody().as(ActivityDetails.class);
        assertNotNull(activity);
        assertEquals(Integer.parseInt(specificActivityId), activity.getId());
    }

    /**
     * Sending a PUT request to the specific Activity endpoint.
     */
    @When("Users Send a PUT request to the specific Activity endpoint")
    public void sendPutRequestToSpecificActivityEndpoint() {
        String specificActivityEndpoint = ActivitiesService.getUpdateActivityEndpoint(specificActivityId);
        response = given()
                .contentType(ContentType.JSON)
                .body(updateRequestBody)
                .put(specificActivityEndpoint);

        updatedActivity = response.as(ActivityDetails.class);
    }

    /**
     * Verifying that the response body contains the updated activity details.
     */
    @Then("the response body should contain the updated activity details")
    public void verifyResponseBodyContainsUpdatedActivity() {
        assertEquals(514, updatedActivity.getId());
        assertEquals("Updated shahid", updatedActivity.getTitle());
        assertEquals("2023-06-18T16:37:25.172Z", updatedActivity.getDueDate());
        assertTrue(updatedActivity.isCompleted());
    }

    /**
     * Sending a DELETE request to the specific Activity endpoint.
     */
    @When("Users Send a DELETE request to the specific Activity endpoint")
    public void sendDeleteRequestToSpecificActivityEndpoint() {
        String specificActivityEndpoint = ActivitiesService.getDeleteActivityEndpoint(specificActivityId);
        response = RestAssured.delete(specificActivityEndpoint);
    }

}
