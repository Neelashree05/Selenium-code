package selenprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayed {

	public static void main(String[] args) {


		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement wtf = driver.findElement(By.xpath("//div[@id='passContainer']"));

		if(wtf.isDisplayed())
		{
			System.out.println("pass");
			//wtf.sendKeys("dndnnd");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
