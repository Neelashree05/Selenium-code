package selenprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.snapdeal.com/");
		
		WebElement signIn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		Actions a= new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//span[text()='Register']")).click();
//
//		driver.switchTo().frame("loginIframe");
//		driver.findElement(By.xpath("//input[@class='col-xs-24']")).sendKeys("vbgggb");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
//
//		driver.switchTo().defaultContent();
//
//		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("watches");

	}

}
