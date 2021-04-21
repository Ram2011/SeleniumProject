package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By submit=By.xpath("//input[@type='submit']");
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
}
