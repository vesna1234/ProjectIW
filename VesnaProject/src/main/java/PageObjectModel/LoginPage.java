package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Base;
import TestData.TestData;

public class LoginPage extends Base{
	
  TestData td = new TestData();
  
    @FindBy(xpath="//a[@href=\"/login?returnUrl=%2F\"]")
    WebElement loginbtn;
	
	@FindBy(xpath = "//input[@class=\"email\"]")
	WebElement emailIputField;
	
	@FindBy(xpath = "//input[@class=\"password\"]")
	WebElement passwordInputFiled;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[@class=\"message-error validation-summary-errors\"]")
	WebElement error;
	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginUser(String username, String password) throws InterruptedException {
		loginbtn.click();
		emailIputField.sendKeys(username);
		Thread.sleep(3000);
		passwordInputFiled.sendKeys(password);
		Thread.sleep(3000);
		LoginBtn.click();
		System.out.println("User is succesfuly login");
	}
	public void loginWithInvalidEmail(String inValidUserName,String password) throws InterruptedException {
		loginbtn.click();
		emailIputField.sendKeys(inValidUserName);
		Thread.sleep(2000);
		passwordInputFiled.sendKeys(password);
		LoginBtn.click();
		Assert.assertEquals(error.getText(),"Login was unsuccessful. Please correct the errors and try again.");
		
		
		
		
		
	}
}
