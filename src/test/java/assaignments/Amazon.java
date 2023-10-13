package assaignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement wt = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		wt.click();
		wt.sendKeys("Mobiles");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='iQOO Neo 7 Pro 5G (Dark Storm, 12GB RAM, 256GB Storage) | Snapdragon® 8+ Gen 1 | Independent Gaming Chip | Flagship 50MP OIS Camera | AG Glass Design']")).click();
		Thread.sleep(3000);
		Set<String> window = driver.getWindowHandles();
		Iterator <String> it = window.iterator();
		String child = it.next();
		driver.switchTo().window(child);

		driver.findElement(By.xpath("//span[text()='iQOO Neo 7 Pro 5G (Dark Storm, 12GB RAM, 256GB Storage) | Snapdragon® 8+ Gen 1 | Independent Gaming Chip | Flagship 50MP OIS Camera | AG Glass Design']")).click();

		WebElement price = driver.findElement(By.xpath("//span[text()='iQOO Neo 7 Pro 5G (Dark Storm, 12GB RAM, 256GB Storage) | Snapdragon® 8+ Gen 1 | Independent Gaming Chip | Flagship 50MP OIS Camera | AG Glass Design']/../../../../../.././../..//span[@class='a-price-whole']"));
		System.out.println(price.getText());




	}

}
