package selenprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.google.com");

		driver.findElement(By.xpath("//textarea[@rows='1']")).sendKeys("phone");

		List<WebElement> values = driver.findElements(By.xpath("//span[text()='phone']"));
		Thread.sleep(3000);
		System.out.println(values.size());
		for(WebElement b : values)
		{
			System.out.println(b.getText());
		}
		Thread.sleep(3000);
		driver.close();

	}
}
