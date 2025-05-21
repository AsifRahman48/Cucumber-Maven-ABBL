package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PG006_CallbackRequest;
import utils.Base;
import utils.Operations;

public class PM005_CallbackRequest extends Base {
    @When("I navigate to the Services for Callback Request")
    public void iNavigateToTheServices() {
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.navBarServices, driver);
        Operations.click(PG006_CallbackRequest.navBarServices, driver);
    }
    @When("I navigate to the Account Services for Callback Request")
    public void iNavigateToTheAccountServices() {
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.navBarAccountServices, driver);
        Operations.click(PG006_CallbackRequest.navBarAccountServices, driver);
    }
    @When("I navigate to the Callback Request")
    public void iNavigateToTheCallback() {
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.navBarCallbackRequest, driver);
        Operations.click(PG006_CallbackRequest.navBarCallbackRequest, driver);
    }
    @When("I can select Start Date")
    public void iCanSelectStartDate() {
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.startDate, driver);
        Operations.click(PG006_CallbackRequest.startDate, driver);
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.SelectStartDate, driver);
        Operations.click(PG006_CallbackRequest.SelectStartDate, driver);
    }
    @When("I can select Start Time")
    public void iCanSelectStartTime() {
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.startTime, driver);
        Operations.click(PG006_CallbackRequest.startTime, driver);
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.SelectStartTime, driver);
        Operations.click(PG006_CallbackRequest.SelectStartTime, driver);
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.OKButton, driver);
        Operations.click(PG006_CallbackRequest.OKButton, driver);
    }
    @When("I can select End Date")
    public void iCanSelectEndDate() {
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.endDate, driver);
        Operations.click(PG006_CallbackRequest.endDate, driver);
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.SelectEndDate, driver);
        Operations.click(PG006_CallbackRequest.SelectEndDate, driver);
    }
    @When("I can select End Time")
    public void iCanSelectEndTime() {
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.endTime, driver);
        Operations.click(PG006_CallbackRequest.endTime, driver);
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.SelectEndTime, driver);
        Operations.click(PG006_CallbackRequest.SelectEndTime, driver);
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.endOKButton, driver);
        Operations.click(PG006_CallbackRequest.endOKButton, driver);
    }
    @Then("I Can enter Query {string}")
    public void iCanEnterQuery(String Query) {
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.query, driver);
        Operations.sendText(PG006_CallbackRequest.query,Query, driver);
    }
    @Then("I can click on the Request button")
    public void iCanClickOnTheRequestButton() {
        Operations.waitUntilElementIsVisible(PG006_CallbackRequest.requestButton, driver);
        Operations.click(PG006_CallbackRequest.requestButton, driver);
    }
}
