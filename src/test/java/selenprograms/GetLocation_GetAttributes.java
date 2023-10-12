package selenprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocation_GetAttributes {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	    WebElement wtf = driver.findElement(By.xpath("//input[@name='email']"));
		
		System.out.println(wtf.getAttribute("aria-label"));
		
		
		Point coordinates = wtf.getLocation();	
		
		int x=coordinates.getX();
		int y=coordinates.getY();
		System.out.println(x);
		System.out.println(y);
		
		
  /*
    
		WebElement wt1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
    Point coordinates=wt1.getLocation();
    
   System.out.println( coordinates.getX());
    System.out.println(coordinates.getY());
    
	*/
	
	}

}
