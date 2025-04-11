Feature: Login functionality

  Scenario: User logs in with valid credentials
    Given the user launches the website
    When the user logs in with valid credentials
    Then the user should be logged in successfully
