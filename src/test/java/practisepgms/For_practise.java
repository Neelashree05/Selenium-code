package practisepgms;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class For_practise {

	public static void main(String[] args) throws Throwable {
		/*
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/V-Guard-Divino-Storage-15-Vertical/dp/B08WRKSF9D?ref_=Oct_DLandingS_D_fa1fed98_0");

	WebElement value = driver.findElement(By.xpath("//span[text()=' V-Guard Divino 5 Star Rated 15 Litre Storage Water Heater (Geyser) with Advanced 4 Level Safety, White ']/../../..//span[@class='a-price-whole']"));
	System.out.println("The value is : "+value.getText());
	}

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		WebElement wt = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));	
		Actions a = new Actions(driver);
		a.doubleClick(wt).perform();
		Thread.sleep(3000);
		 *
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

	WebElement wt = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s = new Select(wt);
	s.selectByIndex(3);
	s.selectByVisibleText("Beauty");
	System.out.println(s.isMultiple());

List<WebElement> values = s.getOptions();
for( WebElement b : values)
{
	System.out.println(b.getText());
}
		*/
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement pressrelease = driver.findElement(By.xpath("//a[text()='Amazon Pay on Merchants']")); //the last webelement adddress to scroll till ther
		
		//downcasting
		JavascriptExecutor js=(JavascriptExecutor) driver; // javascripteExecutor is a interface to access methods we r downcasting
		js.executeScript("arguments[0].scrollIntoView();",pressrelease); //its a syntax to scroll
		Thread.sleep(3000);
		
	}

}
