package selenprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_popup {
	


	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/product.php?product=java");

		WebElement plus = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		Thread.sleep(3000);
		Actions a= new Actions(driver);
		a.doubleClick(plus).perform();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']")).click();
		Thread.sleep(3000);
		Alert al =driver.switchTo().alert();
		//al.accept(); // to accept the popup
		
		System.out.println(al.getText());
		al.dismiss();

	}



}
