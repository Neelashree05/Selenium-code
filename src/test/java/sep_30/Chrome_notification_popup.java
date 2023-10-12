package sep_30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_notification_popup {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();//its a class
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neelashree\\eclipse-workspace\\Java2023\\QCO-SOEJVD-E9\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
	}
}
