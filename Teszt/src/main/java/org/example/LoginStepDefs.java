package org.example;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefs extends AbstractStepDefs {

    @Then("the {string} message is shown")
    public void theErrorMessageMessageIsShown(String errorMessage) {
        assertEquals(errorMessage, homePage.getErrorMessage());
    }

    @Then("verify page {string}")
    public void RightPages(String PageUrl) {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = PageUrl;

        if (!currentUrl.equals(expectedUrl)) {
            throw new AssertionError("Problem current URL is: " + currentUrl);
        }
    }

}
