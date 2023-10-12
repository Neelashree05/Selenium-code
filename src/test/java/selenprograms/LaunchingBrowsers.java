package selenprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowsers {

	public static void main(String[] args) throws Exception {

		//selenium server cant communicate directly with browsers so using below statement
		WebDriverManager.edgedriver().setup();//edge driver related statement

		//setup==>webdriver manager setting up the edge driver//method
		WebDriver driver = new EdgeDriver();//opens the empty edge browser

		
		Thread.sleep(3000);//wait for 3sec

		//maximizing statement
		driver.manage().window().maximize();//communicate with 11th line
		
		}

}
