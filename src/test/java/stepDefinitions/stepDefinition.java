package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	@Given("user launches the url")
    public void background_given() throws Throwable {
        System.out.println("User launches URL");
    }

	@When("user clicks on login button")
    public void background_when() throws Throwable {
        System.out.println("User clicks on Login button");
    }

	@Then("user navigates to login homepage")
    public void background_and() throws Throwable {
       System.out.println("User navigates to Login Home page");
    }
	

	@Given("^(.+) is on Login page$")
    public void user_is_on_login_page(String role) throws Throwable {
        System.out.println(role+" is on Login page");
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

    
    @Given("user is on sign up page")
    public void user_is_on_sign_up_page() {
    	 System.out.println("sign up page");
    }
    
    @When("user signs up into application")
    public void user_signs_up_into_application(List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }
    
    @Then("user should be signed up")
    public void user_should_be_signed_up() {
    	 System.out.println("signed up");
    	 
    }
    
    @Given("chatbot is loaded")
    public void chatbot_is_loaded() {
    	 System.out.println("chatbot is loaded");
    }
    @When("a question is asked to the chatbot")
    public void a_question_is_asked_to_the_chatbot() {
    	 System.out.println("a question is asked to the chatbot");
    }
    @Then("chatbot should respond")
    public void chatbot_should_respond() {
    	 System.out.println("chatbot should respond");
    }
    
}