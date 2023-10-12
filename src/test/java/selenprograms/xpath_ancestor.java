package selenprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_ancestor {
	
	//x_path following
	
public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/Redmi-AMOLED-Snapdragon%C2%AE-Triple-Camera/dp/B0BQ3MMPX6/ref=sr_1_1_sspa?crid=1UUJB8W0RMFOD&keywords=mobile%2Bunder%2B15000&qid=1695475995&sprefix=mobile%2Caps%2C905&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
				driver.findElement(By.xpath("//a[text()='Mobiles']/following-sibling::a[@data-csa-c-content-id='nav_cs_gb']"));

}
}
////a[text()='New Releases']/preceding-sibling::a[@data-csa-c-content-id='nav_cs_gb']