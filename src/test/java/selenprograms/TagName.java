package selenprograms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName {

	public static void main(String[] args) {


		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		for(WebElement b : allLinks) //to print values from collections object 
		{
			System.out.println(b.getText());//to print values/name from the web elements in selemium
		}


	}

}
