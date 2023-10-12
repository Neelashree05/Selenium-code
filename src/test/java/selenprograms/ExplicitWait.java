package selenprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait =new WebDriverWait(driver,10); //explicit wait
		//driver-->webDriver reference
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("fnfnd");
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(login));
		
		login.click();
		
		
	}

}
/*public void explicitwait(WebDriver driver,int time)
{
	wait.until(ExpectedConditions.elementToBeClickable(login)));
}
*/
//SkillraryEcommerce_E9 