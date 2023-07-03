package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import services.IntegrationTestService;

import static io.restassured.RestAssured.given;


/**
 * This class is to define the Steps for IntegrationTest feature file.
 */

public class IntegrationTestStepDefinitions {
    private RequestSpecification request;
    private Response response;

    /**
     * Sending a POST request to create a book using the specified API endpoint.
     *
     * @param endpoint The API endpoint to create a book.
     */
    @When("User Creates a book with API endpoint {string}")
    public void user_creates_a_book_with_api_endpoint(String endpoint) {
        String createBookEndpoint = IntegrationTestService.getBaseUrl() + endpoint;
        String requestBody = "{\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"string\",\n" +
                "    \"description\": \"string\",\n" +
                "    \"pageCount\": 0,\n" +
                "    \"excerpt\": \"string\",\n" +
                "    \"publishDate\": \"2023-06-24T17:19:30.296Z\"\n" +
                "}";

        request = given()
                .contentType(ContentType.JSON)
                .body(requestBody);

        response = request.post(createBookEndpoint);
    }

    /**
     * Sets the request body for the API request.
     *
     * @param requestBody The request body.
     */
    @When("Request body")
    public void request_body(String requestBody) {
        request.body(requestBody);
    }

    /**
     * Sending a POST request to create a cover photo using the specified API endpoint.
     *
     * @param endpoint The API endpoint to create a cover photo.
     */
    @When("Creates Cover photo with API endpoint {string}")
    public void creates_cover_photo_with_api_endpoint(String endpoint) {
        String createCoverPhotoEndpoint = IntegrationTestService.getBaseUrl() + endpoint;
        String requestBody = "{\n" +
                "    \"idBook\": 1,\n" +
                "    \"url\": \"https://placeholdit.imgix.net/~text?txtsize=33&txt=Book 1&w=250&h=350\"\n" +
                "}";

        request = given()
                .contentType(ContentType.JSON)
                .body(requestBody);

        response = request.post(createCoverPhotoEndpoint);
    }

    /**
     * Sending a GET request to retrieve a cover photo by book ID using the specified API endpoint.
     *
     * @param bookId   The ID of the book.
     * @param endpoint The API endpoint to retrieve the cover photo.
     */
    @When("User Get Cover photo by bookid {int} with API endpoint {string}")
    public void user_get_cover_photo_by_bookid_with_api_endpoint(int bookId, String endpoint) {
        String getCoverPhotoEndpoint = IntegrationTestService.getBaseUrl() + endpoint + "/covers/" + bookId;

        response = given().get(getCoverPhotoEndpoint);
    }

    /**
     * Verifying that the response status code matches the expected status code.
     *
     * @param expectedStatusCode The expected status code.
     */
    @Then("The Status code should be {int}")
    public void the_status_code_should_be(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }
    /**
     * Verifying that the response body contains the expected response.
     */
    @Then("Response body should contain the expected response")
    public void response_body_should_contain_the_expected_response() {
        String actualResponseBody = response.getBody().asString();
        String expectedResponseBody =
                "{\n" + "    \"idBook'\": 1,\n" +
                        "    \"url\": \"https://placeholdit.imgix.net/~text?txtsize=33&txt=Book 1&w=250&h=350\"\n" +
                        "}";
        Assert.assertEquals("Response body does not match the expected JSON", expectedResponseBody, actualResponseBody);
    }
}
