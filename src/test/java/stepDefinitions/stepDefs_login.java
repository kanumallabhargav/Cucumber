package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Automation_BDD.cucumber.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.loginObjects;

public class stepDefs_login extends Base
{
	private static Logger log = LogManager.getLogger(stepDefs_login.class.getName());
@Given("^User is on the login page$")
public void user_is_on_the_login_page() throws Throwable {
	driver = webDriverInitialize();
    log.info("Driver initialized; Browser launched");
}

@When("^User logs in into application with username and password$")
public void user_logs_in_into_application_with_username_and_password() throws Throwable {
	loginObjects objectForLoginObjectsClass = new loginObjects(driver);
	objectForLoginObjectsClass.enterUserName().sendKeys(ID());
	log.info("User name Entered");
	objectForLoginObjectsClass.enterPassword().sendKeys(Password());
	log.info("Password entered");
	objectForLoginObjectsClass.clickOnLoginButton().click();
	log.info("Clicked on login button");
    //throw new PendingException();
}
@Then("^Home page is displayed$")
public void home_page_is_displayed() throws Throwable 
{
	loginObjects objectForLoginObjectsClass = new loginObjects(driver);
	boolean check = objectForLoginObjectsClass.verifyHomePage().isDisplayed();
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(objectForLoginObjectsClass.verifyLogin));
	if(check)
	{
		log.info("Home page verified");
	}
	else
	{
		log.error("Cannot verify the home page");
	}
}


}
