
Feature: As user use Login feature

  Scenario: Test login senario with valid credentials
    Given Application up and running
    When I entre valid credentials
    Then Flight Finder page is displayed

