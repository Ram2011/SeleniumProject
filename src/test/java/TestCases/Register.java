package TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.RegisterPage;
import resources.Base;

public class Register extends Base {
	
	public static Logger log=(Logger) LogManager.getLogger(Base.class.getName());
	
	
@BeforeTest
public void initialize() throws IOException
{
	driver=initializedriver();
	log.info("Driver initialized");
	
}
	
	
	@Test
	public void Register()
	{
		driver.get(pr.getProperty("url"));	
		RegisterPage reg=new RegisterPage(driver);
		reg.register().click();
		reg.fullname().sendKeys("Ram Bhanuse");
		reg.email().sendKeys("rambhanuse@gmail.com");
		reg.password().sendKeys("123456");
		reg.confirmpassword().sendKeys("123456");
		reg.iagreeinstr().click();
		reg.iagreeterm().click();
		reg.signup().click();
		log.info("REgistered successfully");
	}

@AfterTest
public void close()
{
	driver.close();
}
	
}
