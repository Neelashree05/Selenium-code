package selenprograms;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_action_related {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement wtf = driver.findElement(By.xpath("//input[@id='email']"));
		wtf.sendKeys("dndnnd");
		Thread.sleep(3000);
		
		wtf.clear();
		
		driver.findElement(By.xpath("//button[@name='login']")).submit();
		
		
		
		
	}

}
