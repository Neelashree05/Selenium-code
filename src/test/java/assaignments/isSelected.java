package assaignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isSelected {
	public static void main(String[] args) {
	
	WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/"); //fb login address

		driver.findElement(By.xpath("//a[text()='Create new account']")).click(); // create a new account address

		WebElement radio = driver.findElement(By.id("u_3_4_gS"));
    	if(radio.isSelected())
		{
			System.out.println("pass");
		}
    	else
		{
			System.out.println("fail");
		}

	}
}
//https://www.naukri.com/registration/createAccount?othersrcp=22636 