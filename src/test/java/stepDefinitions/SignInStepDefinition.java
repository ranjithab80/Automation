package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStepDefinition {

    @Given("Initialize the browser with chrome")
    public void initialize_the_browser_with_chrome() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("initi");
    }

    @And("Navigate to {string} site")
    public void navigate_to_site(String site) {
        System.out.println("site = " + site);
    }

    @And("Clink on Login link in home page to land on secure sign in page")
    public void clink_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
        System.out.println("secure login");
    }

    @When("^User enters (.+) and (.+) and Logs In$")
    public void userEntersUsernameAndPasswordAndLogsIn(String username, String password) {
        System.out.println("username = " + username + ", password = " + password);
    }

    @Then("verify user logged in successfully")
    public void verify_user_logged_in_successfully() {
        System.out.println("success full");
    }

}
