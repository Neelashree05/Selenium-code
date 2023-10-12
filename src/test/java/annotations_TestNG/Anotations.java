package annotations_TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Anotations {
	WebDriver driver;
	@BeforeMethod
	public void opening()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@AfterMethod
	public void quit() throws Throwable
	{
		driver.close();
		Thread.sleep(3000);
	}
	@Test
	public void fb() //main method
	{
	     driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void amz() throws Throwable
	{
		driver.get("https://www.amazon.in/");
	  
	}
	@Test
	public void snapdeel() throws Throwable //main method
	{
		driver.get("https://www.snapdeal.com/");
	
	}
}
