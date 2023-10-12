package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_compatability {
	@Parameters(("browsername"))//give after converting to suite file
	
	@Test
	public void fb(String browser)
	{
		WebDriver driver;
		if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			//open the browser
			driver=new EdgeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Neelashree\\eclipse-workspace\\Java2023\\QCO-SOEJVD-E9\\src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
		}


	}


