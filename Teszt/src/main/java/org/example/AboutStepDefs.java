package org.example;

import io.cucumber.java.en.Then;

public class AboutStepDefs extends AbstractStepDefs {

    @Then("verify pagedes {string}")
    public void RightPages(String PageUrl) {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = PageUrl;

        if (!currentUrl.equals(expectedUrl)) {
            throw new AssertionError("Problem current URL is: " + currentUrl);
        }
    }

}