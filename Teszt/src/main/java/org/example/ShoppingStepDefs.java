package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingStepDefs extends AbstractStepDefs {

    @Given("the {string} is added to the cart")
    public void somethingIsAddedToTheCart(String item) {
        homePage.addItemToCart(item);
    }

    @Then("the price should read {string}")
    public void thePriceShouldRead(String total) {
        assertEquals(total, homePage.getTotal());
    }

    @Then("verify pageS {string}")
    public void RightFlok(String PageUrl) {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = PageUrl;

        if (!currentUrl.equals(expectedUrl)) {
            throw new AssertionError("Problem current URL is: " + currentUrl);
        }
    }
}
