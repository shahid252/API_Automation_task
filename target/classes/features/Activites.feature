Feature: Activities APIS

  Scenario: Get all Activities
    When Users Send a GET request to Activities endpoint
    Then the response status code should be 200
    And the response body should contain a list of activities

  Scenario: Create a new Activity
    When Users Send a POST request to Activities endpoint
    Then the response status code should be 200
    And the response body should contain the created activity details

  Scenario: Get a specific Activity by ID
    Given the ID is "4"
    When Users Send a GET request to the specific Activity endpoint
    Then the response status code should be 200
    And the response body should contain the details of the specific Activity

  Scenario: Update an existing Activity
    Given the ID is "514"
    When Users Send a PUT request to the specific Activity endpoint
    Then the response status code should be 200
    And the response body should contain the updated activity details

  Scenario: Delete an Activity by ID
    Given the ID is "4"
    When Users Send a DELETE request to the specific Activity endpoint
    Then the response status code should be 200

  Scenario: Get a specific Activity by Invalid ID
    Given the ID is "999"
    When Users Send a GET request to the specific Activity endpoint
    Then the response status code should be 404


  Scenario: Update an existing Activity with invalid ID
    Given the ID is "99999"
    When Users Send a PUT request to the specific Activity endpoint
    Then the response status code should be 404


  Scenario: Delete an Activity with invalid ID
    Given the ID is "999"
    When Users Send a DELETE request to the specific Activity endpoint
    Then the response status code should be 404

