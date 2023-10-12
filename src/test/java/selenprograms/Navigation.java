package selenprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable {

		//driver related statement
		WebDriverManager.edgedriver().setup();//mediater

		//opens the edge browser
		WebDriver driver = new EdgeDriver();

		//maximizing the window
		driver.manage().window().maximize();

		//get==> enter to the facebook url	
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		//to ==> navigating from facebook page to amazon
		driver.navigate().to("https://www.amazon.in/");

		Thread.sleep(3000);

		//again back from amazon to facebook page	
		driver.navigate().back();

		Thread.sleep(5000);
		//opening front page of amazon again // back to previous page	
		driver.navigate().forward();

		Thread.sleep(3000);
		//refreshing the facebook page
		driver.navigate().refresh();
		Thread.sleep(3000);

		//driver.close();
		//closing the facebook page
		 driver.quit();

		//import org.openqa.selenium.By; 

	}

}
