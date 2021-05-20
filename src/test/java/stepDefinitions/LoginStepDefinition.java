package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginStepDefinition {

    @Given("^user is on Net banking landing page$")
    public void user_is_on_Net_banking_landing_page() {
        System.out.println("code to user to navigate login page");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("code to login");
    }

    @Then("^Home page is displayed$")
    public void Home_page_is_displayed() {
        System.out.println("home page validation");
    }

    @When("user login into application with username {string}  and password {string}")
    public void user_login_into_application_with_username_and_password(String username, String password) {
        System.out.println("username = " + username + ", password = " + password);
    }

    @And("cards are displayed {string}")
    public void cardsAreDisplayed(String args1) {
        System.out.println("args1 = " + args1);
    }


}