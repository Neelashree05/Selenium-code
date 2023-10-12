package selenprograms;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class single_dd{

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		WebElement wd = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		Select s=new Select(wd);

		s.selectByIndex(5);
		Thread.sleep(3000);

		s.selectByValue("search-alias=aps");//for value method we shld take only value attributes
		Thread.sleep(3000);

		s.selectByVisibleText("Books");
		System.out.println(s.isMultiple());
		List<WebElement> all=s.getOptions();
		System.out.println(all.size());
		for(WebElement b :all)
		{
			System.out.println(b.getText());
		}



	}

}//setTimeout(function() {debugger;}, 6000);
