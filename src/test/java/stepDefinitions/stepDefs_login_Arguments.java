package stepDefinitions;

import Automation_BDD.cucumber.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.loginObjects;

public class stepDefs_login_Arguments extends Base
{
	@Given("^User is on the login page_arguments$")
    public void user_is_on_the_login_pagearguments() throws Throwable 
	{
		driver = webDriverInitialize();
    }

    @When("^User logs in into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_in_into_application_with_username_something_and_password_something(String uName, String passWord) throws Throwable 
    {
    	loginObjects objectForLoginObjectsClass = new loginObjects(driver);
    	objectForLoginObjectsClass.enterUserName().sendKeys(uName);
    	objectForLoginObjectsClass.enterPassword().sendKeys(passWord);
    	objectForLoginObjectsClass.clickOnLoginButton().click();
    }
}
