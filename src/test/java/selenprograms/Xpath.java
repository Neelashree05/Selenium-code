package selenprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		//address of email text field using x path attributes
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dndnd");
		//address of password textfiled using x  path contains attributes
		//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("sbsbbs");

		Thread.sleep(3000);
		//address of forgotten password using x path text
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//addrss of forgotten password using xpath contains text
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();


	}

}
//setTimeout(function() {debugger;},9000);