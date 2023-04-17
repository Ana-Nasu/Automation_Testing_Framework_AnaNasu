Feature: Register feature test suite
  Background:
    Given "https://demo.opencart.com" is accessed
    When MyAccount button is clicked
    And Login button is clicked


  Scenario: Login page URL is accessible from Home Page

    Then "login" is present within the current url

  Scenario Outline: Complete login form with values (.*)

    Then Fill the form with the following values
      | email    | <email>    |
      | password | <password> |
    Examples:
      | email         | password |
      | test@gm.com   | 123456   |
      | test+1@gm.com | 12345    |