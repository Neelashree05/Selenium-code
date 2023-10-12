package selenprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isEnabled {
	
	public static void main(String[] args) {
		
			
			WebDriverManager.edgedriver().setup();
			
			WebDriver driver=new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			WebElement wtd = driver.findElement(By.xpath("//input[@id='email']"));
			
			if(wtd.isEnabled())
			{
				System.out.println("pass");
				wtd.click();
			}
			else
			{
				System.out.println("fail");
			}
	}

}
