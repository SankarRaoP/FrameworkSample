package org.CompanyName.stepDefinitions;

import org.CompanyName.pages.FBLoginPage;
import org.CompanyName.testBase.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBLoginStepDefinition
{
	FBLoginPage fblp;
		
	public FBLoginStepDefinition()
	{
		fblp=new FBLoginPage(TestBase.driver);		
	}
	
	@Given("User navigated to FACEBOOK.COM")
	public void user_navigated_to_facebook_com() {
		TestBase.getUrl(TestBase.OR.getProperty("url"));
	  }

	
	@When("user enter Username as EMAIL and Password PASSWORD")
	public void user_enter_username_as_email_and_password_password() {
		String email=TestBase.OR.getProperty("UserName");
		String password=TestBase.OR.getProperty("Password");
		System.out.println("User Name = "+email+" Password "+password);
		System.out.println("navigating to fblogin page");
	    fblp.inputUserNameAndPassword(email, password);
	}

	
	@When("user click on login button")
	public void user_click_on_login_button() throws Exception {
	    fblp.clickLoginButton();
	   
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
	    fblp.verifyHomePage();
	   
	}

	
}
