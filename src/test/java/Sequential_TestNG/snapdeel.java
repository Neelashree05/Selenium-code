package Sequential_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class snapdeel {

	@Test
	public void snap()
	{
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
	}

}
