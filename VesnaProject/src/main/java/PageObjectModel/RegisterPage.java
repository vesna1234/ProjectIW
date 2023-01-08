package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Base;

import TestData.TestDataRegister;

public class RegisterPage extends Base {
	TestDataRegister td = new TestDataRegister();
	
	@FindBy(xpath="//a[@href=\"/register?returnUrl=%2F\"]")
	WebElement registerbtn;
	
	@FindBy(id="FirstName")
	WebElement firstn;
	
	@FindBy(id="LastName")
	WebElement lastn;
	
	@FindBy(xpath="//select[@name=\"DateOfBirthDay\"]")
	WebElement days;
	
	@FindBy(xpath="//select[@name=\"DateOfBirthMonth\"]")
	WebElement months;
	
	@FindBy(xpath="//select[@name=\"DateOfBirthYear\"]")
	WebElement years;
	
	@FindBy(id="Email")
	WebElement emailf;
	
	@FindBy(id="Email")
	WebElement invalidemailf;
	
	@FindBy(id="Email")
	WebElement existingemailf;
	
	@FindBy(id="Password")
	WebElement passf;
	
	@FindBy(id="ConfirmPassword")
	WebElement conpassf;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	WebElement regbtn;
	
	@FindBy(xpath="//div[@class=\"result\"]")
	WebElement complregistr;
	
    @FindBy(xpath="//span[@id=\"Email-error\"]")
    WebElement wrongemail;

    @FindBy(xpath="//div[@class=\"message-error validation-summary-errors\"]")
    WebElement existedemail;
  public RegisterPage() {
	PageFactory.initElements(driver, this);
}
   public void RegisterWithWalidEmail
   (String firstname, String lastname, String day,String month,String year,String email,String pass,String conpass) throws InterruptedException      {
   
      registerbtn.click();
      firstn.sendKeys(firstname);
      //Thread.sleep(2000);
      lastn.sendKeys(lastname);
      Thread.sleep(2000);
      days.sendKeys(day);
      Thread.sleep(2000);
      months.sendKeys(month);
      Thread.sleep(2000);
      years.sendKeys(year);
      Thread.sleep(2000);
      emailf.sendKeys(email);
      Thread.sleep(2000);
      passf.sendKeys(pass);
      Thread.sleep(2000);
      conpassf.sendKeys(conpass);
      Thread.sleep(2000);
      regbtn.click();
      Assert.assertEquals(complregistr.getText(), "Your registration completed");
      
}
public void RegisterNewUserWithInvalidEmail
(String firstname, String lastname, String day,String month,String year,String invalidemail,String pass,String conpass) throws InterruptedException {
	registerbtn.click();
    firstn.sendKeys(firstname);
    lastn.sendKeys(lastname);
    days.sendKeys(day);
    months.sendKeys(month);
    years.sendKeys(year);
    invalidemailf.sendKeys(invalidemail);
    Thread.sleep(2000);
    passf.sendKeys(pass);
    conpassf.sendKeys(conpass);
    regbtn.click();
    Thread.sleep(2000);
    Assert.assertEquals(wrongemail.getText(),"Wrong email");
}
public void RegisterUserWithExisistingEmail
(String firstname, String lastname, String day,String month,String year,String existingemail,String pass,String conpass ) throws InterruptedException {
	registerbtn.click();
    firstn.sendKeys(firstname);
    lastn.sendKeys(lastname);
    days.sendKeys(day);
    months.sendKeys(month);
    years.sendKeys(year);
    existingemailf.sendKeys(existingemail);
    Thread.sleep(2000);
    passf.sendKeys(pass);
    conpassf.sendKeys(conpass);
    regbtn.click();
    Thread.sleep(2000);
	Assert.assertEquals(existedemail.getText(),"The specified email already exists");
	
}

}
