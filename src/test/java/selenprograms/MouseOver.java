package selenprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws Throwable {


		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.snapdeal.com/");

		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));

		Actions a= new Actions(driver);//to perform move over action first need to create object for action class
		//then need to pass an webdriver reference wch indicates that selenium to perform actions on web element

		a.moveToElement(signin).perform();//perform==>to perform operation
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();

	}

}
//setTimeout(function() {debugger;}, 9000); ==>to freeze the screen in webpage enter this code in
//console of developer tool then place cursor on element thn press enter