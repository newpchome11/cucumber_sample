package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	@Given("^User is on Login page$")
    public void user_is_on_login_page() throws Throwable {
        System.out.println("User is on Login page");
    }

	@When("^User logs in with credetials (.+) and (.+)$")
    public void user_logs_in_with_credetials_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

	@Then("^Homepage (.+) displayed$")
    public void homepage_displayed(String display) throws Throwable {
       System.out.println("Home page "+display+" displayed");
    }

    @And("^Response displayed is (.+)$")
    public void response_displayed_is(String result) throws Throwable {
        System.out.println(result);
    }

}