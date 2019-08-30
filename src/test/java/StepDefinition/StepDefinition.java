package StepDefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectDirectory.Base;
import PageObject.Homepage;
import PageObject.LoginPortal;
import PageObject.PageObjectPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base{
	
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Base.broswerOpening();

	    
	}

	@When("^user login into appliaction with username and password$")
	public void user_login_into_appliaction_with_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Homepage hp=new Homepage(driver);
		hp.clickOnPageObjectModelLink();
	   
	}

	@Then("^Homepage should populated$")
	public void homepage_should_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Homepage hp=new Homepage(driver);
		hp.SwitchToChildWindow();
		PageObjectPage pageobjectpage=new PageObjectPage(driver);
		pageobjectpage.clickOnFindOutMoreButton();
		pageobjectpage.clickOnCloseButton();
		hp.SwitchToParentWindow();
	   
	}
	
	@Given("^Use is on home page$")
	public void use_is_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Base.broswerOpening();
	}

	@When("^Click on login portral link$")
	public void click_on_login_portral_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Homepage hp=new Homepage(driver);
	    hp.clickOnLoginPortal();
	}

	@When("^Enter the username and password and hit the login button$")
	public void enter_the_username_and_password_and_hit_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Homepage hp=new Homepage(driver);
		hp.SwitchToChildWindow();
		LoginPortal lp=new LoginPortal(driver);
		lp.enterUsernameAndPassword();
		
       
	}

@Then("^User should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}




}
