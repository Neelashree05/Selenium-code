package practisepgms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_index {
	
	public static void main(String[] args) 
	{
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoapp.skillrary.com/");
		
		driver.findElement(By.xpath("(//i[@class='fa fa-facebook\'])[1]")).click();
	}

}
