package stepdefinitions;

import io.cucumber.java.en.When;
import objectRepository.PG007_Logout;
import utils.Base;
import utils.Operations;

public class PM006_Logout extends Base {

    @When("Navigate to the login page when click on the logout button")
    public void navigateToLoginPage() {
        Operations.waitUntilElementIsVisible(PG007_Logout.logoutButton, driver);
        Operations.click(PG007_Logout.logoutButton, driver);
        Operations.waitUntilElementIsVisible(PG007_Logout.yesButton, driver);
        Operations.click(PG007_Logout.yesButton, driver);
    }
}
