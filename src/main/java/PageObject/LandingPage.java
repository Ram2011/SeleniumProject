package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	


	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	By Signin=By.xpath("//span[text()='Login']");

	
	public WebElement signin()
	{
		
		return driver.findElement(Signin);
	}
}
