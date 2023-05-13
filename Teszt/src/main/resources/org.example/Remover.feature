Feature: Saucedemo Remove

  Background:
    Given the home page is opened
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario: Buying a many things
    Given the 'Sauce Labs Backpack' is added to the cart
    And the 'Sauce Labs Bike Light' is added to the cart
    And the 'Cart' button is clicked
    And the 'Continue Shopping' button is clicked
    And the 'Sauce Labs Backpackr' is removed from the cart
    And the 'Sauce Labs Bike Lightr' is removed from the cart
    And the 'Cart' button is clicked
    Then verify pageSrr "https://www.saucedemo.com/cart.html"










