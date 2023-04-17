
Feature: Register feature test suite
  Background:
    Given "https://demo.opencart.com" is accessed

  Scenario: Register page URL is accessible from Home Page

    When MyAccount button is clicked
    And Register button is clicked
    Then "register" is present within the current url


  Scenario Outline: Register page url contains following word <keyword>

    When MyAccount button is clicked
    And Register button is clicked
    Then "<keyword>" is present within the current url
    Examples:
      | keyword          |
      | index            |
      | account/register |


