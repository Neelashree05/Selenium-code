package practisepgms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable {


		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward(); //first url

		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.close();


	}

}
