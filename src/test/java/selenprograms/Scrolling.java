package selenprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		WebElement pressrelease = driver.findElement(By.xpath("//a[text()='Press Releases']")); //the last webelement adddress to scroll till ther
		
		//downcasting
		JavascriptExecutor js=(JavascriptExecutor) driver; // javascripteExecutor is a interface to access methods we r downcasting
		js.executeScript("arguments[0].scrollIntoView();",pressrelease); //its a syntax to scroll
		Thread.sleep(3000);
		//pressrelease.click();
		//js.executeScript("arguments[0].click();",pressrelease);//to click
		
	}

}
