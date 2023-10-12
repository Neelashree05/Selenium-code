package selenprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.id("email")).sendKeys("7022423118");//used to send data 
		
	//	driver.findElement(By.id("pass")).sendKeys("Vishwa2222");
		
		driver.findElement(By.linkText("Create a Page")).click();
		
	//	driver.findElement(By.partialLinkText("Create a")).click();	
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
	}

}
