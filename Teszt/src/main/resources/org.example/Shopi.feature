Feature: Saucedemo Shopi

  Background:
    Given the home page is opened
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario: Buying a many things
    Given the 'Sauce Labs Backpack' is addedd to the cart
    And the 'Sauce Labs Bolt T-Shirt' is addedd to the cart
    And the 'Sauce Labs Bike Light' is addedd to the cart
    And the 'Sauce Labs Fleece Jacket' is addedd to the cart
    And the 'Cart' button is clicked
    And the 'Checkout' button is clicked
    And the 'First Name' field is filled with 'testname_first'
    And the 'Last Name' field is filled with 'testname_last'
    And the 'Zip Code' field is filled with '1111'
    And the 'Continue' button is clicked
    And the 'Finish' button is clicked
    And the 'BackHome' button is clicked
    Then verify pageSe "https://www.saucedemo.com/inventory.html"