package selenprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_locator {
	
	public static void main(String[] args) {
		
		//selenium server cant communicate directly with browsers so using below statement
				WebDriverManager.edgedriver().setup();//edge driver related statement

				//setup==>webdriver manager setting up the edge driver//method
				WebDriver driver = new EdgeDriver();//opens the empty edge browser
//FirefoxDriver driver=new FirefoxDriver();
				
				//Thread.sleep(3000);//wait for 3sec

				//maximizing statement
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vnvnv");
		
	}

}
