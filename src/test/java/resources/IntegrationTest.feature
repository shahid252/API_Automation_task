Feature: Integration test between Book And Cover Photo

  Scenario: Creating a Book, CoverPhoto and Getting CoverPhoto by BookID

    When User Creates a book with API endpoint "Books"
    And Creates Cover photo with API endpoint "CoverPhotos"
    And User Get Cover photo by bookid 1 with API endpoint "CoverPhotos/books"
    Then The Status code should be 200
    And Response body should contain the expected response

