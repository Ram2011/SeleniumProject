package TestCases;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import PageObject.LandingPage;
import PageObject.LoginPage;
import resources.Base;

public class NavigateHome extends Base{


	public static Logger log=(Logger) LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializedriver();
		log.info("Driver initialized");
			
	}
	
	@Test(dataProvider = "getData")
	public void navigateHome(String Username,String Password) throws IOException, InterruptedException
	{
		driver.get(pr.getProperty("url"));
		LandingPage h=new LandingPage(driver);
		 h.signin().click();
		 Thread.sleep(3000);
		 LoginPage l=new LoginPage(driver);
		 l.email().sendKeys(Username);
		 l.password().sendKeys(Password);
		 l.submit().click();
		 log.info("Login combination Tried");
		Assert.assertTrue(false);
		 
	}
	
	@DataProvider
	public Object[][] getData()
	{
	
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="rightuser";
		obj[0][1]="123456";
		
		obj[1][0]="wronguser";
		obj[1][1]="123456";
		
		return obj;
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
