package practisepgms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ts {
	
	public static void main(String[] args) throws Throwable {
		
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in/");
	WebElement wt = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
	wt.click();
	
	TakesScreenshot t=(TakesScreenshot) driver;
	File src=t.getScreenshotAs(OutputType.FILE);
	
	File dst= new File("./Screenshots/amz.png");
	FileUtils.copyFile(src, dst);
	
	
	

}
}
