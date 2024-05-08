Feature:Login functionality tests

  Scenario: Positive Test. Login with valid credentials
    Given open browser and navigate to retail app
    When click on sign in button
    And Enter username "fahim.mohammadi@tekschool.us" and password "King078564#"
    Then click on login button
    Then validate account button is displayed
    Then quite browser

