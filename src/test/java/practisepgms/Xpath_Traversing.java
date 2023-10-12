package practisepgms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Xpath_Traversing {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
	/*	driver.get("https://www.flipkart.com/all/~cs-1b27f7a18e62a2dbf664c98933587713/pr?sid=tyy,hry,jut&marketplace=FLIPKART&restrictLocale=true");
		WebElement value = driver.findElement(By.xpath("//div[text()='HP 360 Intel Celeron Quad Core N4020 - (4 GB/64 GB EMMC Storage/Chrome OS) 14a-ca0504TU Chromebook']/../..//div[@class='_30jeq3 _1_WHN1']"));
		System.out.println(value.getText());
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		//System.out.println(wt.getText());;
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Fundra")).click();
		
		to get all the tagname of a
		driver.get("https://www.facebook.com/");
		List<WebElement> wt = driver.findElements(By.tagName("a"));
		
		for(WebElement b : wt) //collection of elements
		{
			System.out.println(b.getText());
		}
		** xpath by attributes **
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_7qhce485bd_e&adgrpid=1322714095756137&hvadid=82669889959645&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=157319&hvtargid=kwd-82670512756912:loc-90&hydadcr=14453_2154374");
	driver.findElement(By.xpath("(//a[@class='nav-a  '][2])")).click();
		** xpath by contains wrt text
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_7qhce485bd_e&adgrpid=1322714095756137&hvadid=82669889959645&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=157319&hvtargid=kwd-82670512756912:loc-90&hydadcr=14453_2154374");
	
	    driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
	
		driver.get("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");
		driver.findElement(By.xpath("//h1[text()='Enjoy these benefits with ']")).click();
	
	  ** Xpath traversing **
		driver.get("https://www.flipkart.com/tyy/4io/~cs-rq8mpzr8t6/pr?sid=tyy%2C4io&collection-tab-name=Samsung+Galaxy+S22+5G&param=50963&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJpbmNsIG9mIG9mZmVycyJdLCJ2YWx1ZVR5cGUiOiJNVUxUSV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIlNhbXN1bmcgUzIyIDVHIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiTU9CR0dHMllLWVBXUENOUCIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX19fX0%3D");
		Thread.sleep(3000);
		WebElement wt = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S22 5G (Phantom Black, 128 GB)']/../../../../..//div[@class='_30jeq3 _1_WHN1']"));
	    System.out.println(wt.getText());
	
	*
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://www.facebook.com/");
		WebElement wt = driver.findElement(By.xpath("//a[text()='Marketplace']"));
	wait.until(ExpectedConditions.visibilityOf(wt));
	wt.click();
	
		//to get attribute using attribute name
		driver.get("https://www.facebook.com/");
	 WebElement wt = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));//.getAttribute("placeholder");
	
       System.out.println(wt.getAttribute("placeholder"));
			//to get location
		driver.get("https://www.facebook.com/");

		WebElement wt1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
  // Point coordinates=wt1.getLocation();
   
 // System.out.println( coordinates.getX());
   //System.out.println(coordinates.getY());
		
		Dimension size = wt1.getSize();
		int h=size.getHeight();
		int w=size.getWidth();
		
		System.out.println(h);
		System.out.println(w);
	*/
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_7qhce485bd_e&adgrpid=1322714095756137&hvadid=82669897710514&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149209&hvtargid=kwd-82670512756912:loc-90&hydadcr=14453_2334184");
	Thread.sleep(3000);

		//driver.navigate().to("	https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		//Thread.sleep(3000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		
		//System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
	driver.quit();
	}
	

}
