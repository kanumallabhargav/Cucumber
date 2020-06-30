package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginObjects 
{
	public WebDriver driver;
	private By userName = By.id("user_email");
	private By passWord = By.id("user_password");
	private By submit = By.xpath("//input[@type='submit']");
	public By verifyLogin = By.xpath("//a[contains(@href , '/courses/enrolled')]");
	public loginObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	public WebElement enterUserName()
	{
		return driver.findElement(userName);
	}
	public WebElement enterPassword()
	{
		return driver.findElement(passWord);
	}
	public WebElement clickOnLoginButton()
	{
		return driver.findElement(submit);
	}
	public WebElement verifyHomePage()
	{
		return driver.findElement(verifyLogin);
	}
}
