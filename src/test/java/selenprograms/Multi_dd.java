package selenprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_dd {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement wt = driver.findElement(By.xpath("//select[@name='cars']"));//selecting whole values
		Select s= new Select(wt);
		System.out.println(s.isMultiple());

		s.selectByIndex(0);

		Thread.sleep(3000);
		s.selectByValue("199");

		Thread.sleep(3000);
	//	s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		Thread.sleep(3000);
		s.deselectByIndex(0);
		s.deselectByValue("199");
		List<WebElement> values =s.getAllSelectedOptions();	

		for(WebElement b : values)
		{
			System.out.println(b.getText());
		}

	}

}
