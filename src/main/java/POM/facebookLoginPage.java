package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLoginPage {
	//declaration
	//address of email texr field
	@FindBy(id="email")
	private WebElement emailTf;
	//address  of password field
	@FindBy(name="pass")
	private WebElement passwordTf;
	//address of login button
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	//initialization
	public facebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);;
	}
	//if id attrubte value got changed then pagefactory cls will assaign the new value to old value

	//getter methods
	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//Buissness libraries ==> to send data or to perform some operations
	public void emailTextFiled(String data)
	{
		emailTf.sendKeys(data);
	}
	public void passwordtextfield(String data)
	{
		passwordTf.sendKeys(data);
	}
	public void loginButton()
	{
		loginBtn.click();
	}

}
