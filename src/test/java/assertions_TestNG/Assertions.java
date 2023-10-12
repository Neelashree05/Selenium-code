package assertions_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver driver;
	@Test
	public void fb()
	{

		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String title=driver.getTitle();
		//hardassert--> if its return false thn next statmnt in the method will not execute
		//Assert.assertEquals(title,"xnxnnx");//false
		//System.out.println(driver.getCurrentUrl());
		//softassert-->if its fail also it will execute next statement
		SoftAssert s = new SoftAssert(); 
		s.assertEquals(title,"dnnjd");//false
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void quiting()
	{
		driver.quit();
	}

}
