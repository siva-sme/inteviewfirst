package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

	
	@RunWith(Cucumber.class)
	public class stepDefination {

	    @Given("^user is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	    	
	    	System.out.println("Test Executed");
	        
	    }

	    @When("^user login into application$")
	    public void user_login_into_application() throws Throwable {
	      
	    }

	    @Then("^Home page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	    	System.out.println("Test Executed Middle");
	    }

	    @And("^All the fields are displayed$")
	    public void all_the_fields_are_displayed() throws Throwable {
	       
	    }

	    @And("^mobile app fields are displayed$")
	    public void mobile_app_fields_are_displayed() throws Throwable {
	    	
	    	System.out.println("Test Executed last");
	        
	    }

}
