package selenprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class date {
		
		public static void main(String[] args) throws Throwable {

			WebDriverManager.edgedriver().setup();

			WebDriver driver=new EdgeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.redbus.in/");
			driver.findElement(By.xpath("//span[@class='dateText']"));
			driver.findElement(By.xpath(""))
			
	}

}
