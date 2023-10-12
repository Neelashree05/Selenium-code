package selenprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_traversing {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/s?k=mobile+under+15000&crid=1UUJB8W0RMFOD&sprefix=mobile%2Caps%2C905&ref=nb_sb_ss_inft-rank-pairwise-override-in-t3_3_6");
WebElement value = driver.findElement(By.xpath("//span[text()='Redmi Note 12 5G Matte Black 4GB RAM 128GB ROM | 1st Phone with 120Hz Super AMOLED and Snapdragon® 4 Gen 1 | 48MP AI Triple Camera']/../../../../..//span[@class='a-price-whole']"));
	System.out.println(value.getText());
	
	}
}
