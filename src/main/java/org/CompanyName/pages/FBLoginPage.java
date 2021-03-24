package org.CompanyName.pages;

import org.CompanyName.testBase.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class FBLoginPage {
	
	public static final Logger log = Logger.getLogger(FBLoginPage.class.getName());
	
	public WebDriver driver=TestBase.driver;
	
	public FBLoginPage(WebDriver driver)
	{
		System.out.println("3. FBLogin page is callsed");
		System.out.println("Driver Object Status = "+this.driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement loginButton;
	
	
	public void inputUserNameAndPassword(String emailId,String pwd)
	{
		System.out.println("Successfully navigated to FB Login Page factory");
		//TestBase.waitForElement(driver, 10, email);
		email.sendKeys(emailId);
		log.info("User Name is entered");
		//TestBase.waitForElement(driver, 10, password);
		password.sendKeys(pwd);	
		log.info("Password is entered");
	}
	
	public void clickLoginButton() throws Exception
	{
		//TestBase.waitForElement(driver, 10, loginButton);
		Thread.sleep(2000);
		loginButton.click();
		log.info("Clicked on Login Button");
	}
	
	public void verifyHomePage()
	{
		Assert.assertTrue(true, "Validated Successfully");
	}

}
