package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By register=By.xpath("//span[text()='Register']");
	By fullname=By.xpath("//input[@id='user_name']");
	By email=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By confirmpassword=By.xpath("//input[@id='user_password_confirmation']");
	By iagreeinstr=By.xpath("//input[@id='user_unsubscribe_from_marketing_emails']");
	By iagreeterm=By.xpath("//input[@id='user_agreed_to_terms']");
	By signup=By.xpath("//input[@value='Sign Up']");
	
	public WebElement register()
	{
		return driver.findElement(register);
	}
	
	public WebElement fullname()
	{
		return driver.findElement(fullname);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement confirmpassword()
	{
		return driver.findElement(confirmpassword);
	}
	
	public WebElement iagreeinstr()
	{
		return driver.findElement(iagreeinstr);
	}
	
	public WebElement iagreeterm()
	{
		return driver.findElement(iagreeterm);
	}
	
	public WebElement signup()
	{
		return driver.findElement(signup);
	}
	
}
