package sep_3_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.facebookLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_login {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//object creation
		facebookLoginPage fbl=new facebookLoginPage(driver);
		fbl.emailTextFiled("neela");
		fbl.passwordtextfield("shree");
		fbl.loginButton();
	}

}
