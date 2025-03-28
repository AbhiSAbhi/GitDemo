package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps 
{
	@Given("User is on NetBanking Page")
	public void user_is_on_net_banking_page() {
	    System.out.println("User landed on NetBanking Page");
	}
	    
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() 
	{
	    System.out.println("Practice landing page");	
	}
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) 
	{
	 System.out.println(data.get(0));
	 System.out.println(data.get(1));
	 System.out.println(data.get(2));
	 System.out.println(data.get(3));
	}

//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String username, String password) 
//	{
//       System.out.println(username + " and password is "+password);
//		}
	
	//Regular Expression Regex
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) 
	{
       System.out.println(username + " and password is "+password);
       //Below Steps are added for practice purpose to test Github - this project is cloned from GitHub Repository
       System.out.println("User should be logged in");
       System.out.println("User should be able to view UI of Email");
       
       System.out.println("User should be able to view Compose");
       System.out.println("User should be able to view Inbox");
       System.out.println("User should be able to view sent");
       System.out.println("User should be able to view Junk");
       
		}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	   System.out.println("Home page is displayed");
	   System.out.println("Develop branch code1");
	}
	@Then("Cards are displayed")
	public void cards_are_displayeds() {
	    System.out.println("Cards are displayed");
	    System.out.println("Develop branch code2");
	    System.out.println("Develop branch code3");
	}
	
	@Given("setup the entries in database")
	public void setupEntries()
	{
		System.out.println("************");
		System.out.println("setup the entries in database");
		System.out.println("Develop branch code4");
		System.out.println("Develop branch code5");
	}
	
	@When("launch the browser from config variables")
	public void launchBrowser()
	{
		System.out.println("launch the browser from config variables");
		System.out.println("Develop branch code modification by X Gitstuff architect");
	}
	
	@When("hit the home page url of banking site")
	public void homePageUrl()
	{
		System.out.println("hit the home page url of banking site");
	}
}




