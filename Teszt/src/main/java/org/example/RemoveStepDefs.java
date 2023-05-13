package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RemoveStepDefs extends AbstractStepDefs {

    @Given("the {string} is removed from the cart")
    public void somethingisremovedfromthecart(String item) {
        homePage.RemoveItemFromCart(item);
    }

    @Then("verify pageSrr {string}")
    public void RightFlok(String PageUrl) {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = PageUrl;

        if (!currentUrl.equals(expectedUrl)) {
            throw new AssertionError("Problem current URL is: " + currentUrl);
        }
    }
}