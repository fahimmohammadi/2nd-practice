Feature: Home Page Validation

  Scenario: Validate home page title.
    Given open browser and navigate to retail app
    Then Validate Title  on top left corner
    Then quite browser

  Scenario: Navigate to retail app and make sure sign in button is enable
   Given open browser and navigate to retail app
   Then Validate sign in button is enable
   Then quite browser