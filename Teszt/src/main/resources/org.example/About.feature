Feature: Saucedemo Logout

  Background:
    Given the home page is opened
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked


  Scenario: Buying a many things
    Given the "Tool" button is clicked
    And the 'About' button is clicked
    Then verify pagedes "https://saucelabs.com/"