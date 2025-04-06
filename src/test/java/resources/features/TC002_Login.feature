Feature: Login

  Scenario: Verify navigate to ABDirect Splash & Login and titles of the pages
    Given I open the browser
    When I navigate to "https://abdirectcloud.abbl.com/welcome-page"
    Then I should see the page title "ABDirect"
    When I click on the Login Button
    Then I navigate to the Login Page and can see login title "Log In to Your Account"

  Scenario: Verify Successful Login With Device Binding
    When I login with "Shams1" and "123456@Ff"
    Then I should see OTP Channel Selection Modal for Device Binding "We found a new device, would you like to bind it to continue?"
    When I verify 2fa Successfully With SMS "1111"
    Then I navigate to my dashboard