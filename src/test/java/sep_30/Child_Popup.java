package sep_30;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Popup {
	
	public static void main(String[] args) throws Throwable {
		

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.get("https://skillrary.com/");
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath(" //a[contains(text(),'GEARS')]")).click();
		driver.findElement(By.xpath(" (//a[contains(text(),' SkillRary Essay')])[2]")).click();
		Set<String> child =driver.getWindowHandles();
		for(String b :child)
		{
			driver.switchTo().window(b);	
			}
		Thread.sleep(3000);
		driver.findElement(By.id("mytext")).sendKeys("neela");
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[contains(text(),'CATEGORIES')]")).click();
}
}