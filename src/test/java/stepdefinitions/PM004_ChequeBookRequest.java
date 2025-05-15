package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PG005_ChequeBookRequest;
import org.openqa.selenium.JavascriptExecutor;
import utils.Base;
import utils.Operations;

public class PM004_ChequeBookRequest extends Base {

    @When("I navigate to the Services")
    public void iNavigateToTheService() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.navBarServices, driver);
        Operations.click(PG005_ChequeBookRequest.navBarServices, driver);
    }
    @When("I navigate to the Account Services")
    public void iNavigateToTheAccountService() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.navBarAccountServices, driver);
        Operations.click(PG005_ChequeBookRequest.navBarAccountServices, driver);
    }
    @When("I navigate to the Cheque Book Request")
    public void iNavigateToTheChequeBookRequest() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.navBarChequeBookRequest, driver);
        Operations.click(PG005_ChequeBookRequest.navBarChequeBookRequest, driver);
    }
    @When("I can choose your Account")
    public void iCanChooseYourAccount() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.clickOnSelectAccount, driver);
        Operations.click(PG005_ChequeBookRequest.clickOnSelectAccount, driver);
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.SelectYourAccount, driver);
        Operations.click(PG005_ChequeBookRequest.SelectYourAccount, driver);
    }
    @When("I can select Leaf Size")
    public void iCanSelectLeafSize() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.clickOnSelectLeafSize, driver);
        Operations.click(PG005_ChequeBookRequest.clickOnSelectLeafSize, driver);
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.SelectLeafSize, driver);
        Operations.click(PG005_ChequeBookRequest.SelectLeafSize, driver);
    }
    @When("I can select Division")
    public void iCanSelectDivision() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.clickOnSelectDivision, driver);
        Operations.click(PG005_ChequeBookRequest.clickOnSelectDivision, driver);
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.SelectDivision, driver);
        Operations.click(PG005_ChequeBookRequest.SelectDivision, driver);
    }
    @When("I can select District")
    public void iCanSelectDistrict() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.clickOnSelectDistrict, driver);
        Operations.click(PG005_ChequeBookRequest.clickOnSelectDistrict, driver);
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.SelectDistrict, driver);
        Operations.click(PG005_ChequeBookRequest.SelectDistrict, driver);
    }
    @When("I can select Delivery Point")
    public void iCanSelectDeliveryPoint() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.clickOnSelectDeliveryPoint, driver);
        Operations.click(PG005_ChequeBookRequest.clickOnSelectDeliveryPoint, driver);
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.SelectDeliveryPoint, driver);
        Operations.click(PG005_ChequeBookRequest.SelectDeliveryPoint, driver);
    }
    @When("I can select Delivery Location")
    public void iCanSelectDeliveryLocation() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.clickOnSelectDeliveryLocation, driver);
        Operations.click(PG005_ChequeBookRequest.clickOnSelectDeliveryLocation, driver);
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.SelectDeliveryLocation, driver);
        Operations.click(PG005_ChequeBookRequest.SelectDeliveryLocation, driver);
    }
    @When("I can click on the next button")
    public void iCanClickOnTheNextButton() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.clickOnSelectDeliveryLocation, driver);
        Operations.click(PG005_ChequeBookRequest.NextButton, driver);
    }
    @Then("I can click on the Terms & Conditions checkbox and click on the Send OTP button")
    public void checkboxAndSendOTP() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.CheckBox, driver);
        Operations.click(PG005_ChequeBookRequest.CheckBox, driver);
        Operations.click(PG005_ChequeBookRequest.SendOTP, driver);
    }
    @Then("Enter OTP {string}")
    public void checkboxAndSendOTP(String OTP) {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.EnterOTP, driver);
        Operations.sendText(PG005_ChequeBookRequest.EnterOTP,OTP, driver);
    }
    @Then("I can click on the next button on OTP Page")
    public void iCanClickOnOTPNextButton() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.OTPNextButton, driver);
        Operations.click(PG005_ChequeBookRequest.OTPNextButton, driver);
    }
    @Then("I can click on the Go to Home button")
    public void iCanClickOnGoToHomeButton() {
        Operations.waitUntilElementIsVisible(PG005_ChequeBookRequest.GoToHomeButton, driver);
        Operations.click(PG005_ChequeBookRequest.GoToHomeButton, driver);
    }
}
