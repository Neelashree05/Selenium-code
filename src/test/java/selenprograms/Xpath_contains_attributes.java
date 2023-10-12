package selenprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_contains_attributes {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[contains(@class,'_58bkzq62 _3n8fnaug _3n8fnamv _3n8fnaf9 _3n8fna1 _3n8fna7n _58bkzqh _1i2djtb9 _1i2djt0')]"));
	}

}
