package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Base;
import TestData.TestDataRegister;


public class Account extends  Base  {
	TestDataRegister td = new TestDataRegister();
	
	@FindBy(xpath="//a[@href=\"/register?returnUrl=%2F\"]")
	WebElement registerbtn;
	
	@FindBy(id="FirstName")
	WebElement firstn;
	
	@FindBy(id="LastName")
	WebElement lastn;
		
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
    @FindBy(xpath="//a[@class=\"button-1 register-continue-button\"]")
    WebElement continu;
    @FindBy(xpath="//a[@href=\"/login?returnUrl=%2F\"]")
    WebElement loginbtn;
	
	@FindBy(xpath = "//input[@class=\"email\"]")
	WebElement emailIputField;
	
	@FindBy(xpath = "//input[@class=\"password\"]")
	WebElement passwordInputFiled;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	WebElement LoginBtn;
	@FindBy(xpath="(//a[@href=\"/customer/info\"])[1]")
	WebElement myaccount;
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	WebElement save;
	@FindBy(xpath="//a[@href=\"/logout\"]")
	WebElement logout;
	@FindBy(xpath="//a[@href=\"/customer/downloadableproducts\"]")
    WebElement download; 	
	@FindBy(xpath="//div[@class=\"no-data\"]")
	WebElement nodata;
	@FindBy(xpath="//a[@href=\"/backinstocksubscriptions/manage\"]")
	WebElement backtostock;
	@FindBy(xpath="//a[@href=\"/customer/changepassword\"]")
    WebElement changepass;	
	@FindBy(xpath="(//input[@type=\"password\"])[1]")
	WebElement oldpass;
	@FindBy(xpath="(//input[@type=\"password\"])[2]")
	WebElement newpass;
	@FindBy(xpath="(//input[@type=\"password\"])[3]")
	WebElement connewpass;
	@FindBy(xpath="//button[@class=\"button-1 change-password-button\"]")
	WebElement changepassw;
	@FindBy(xpath="//p[@class=\"content\"]")
	WebElement passchange;
	
	
	
  public Account() {
	PageFactory.initElements(driver, this);
}
   public void testcase001 () throws InterruptedException      {
   
      registerbtn.click();
      firstn.sendKeys("user");
      lastn.sendKeys("user");
      Thread.sleep(2000);
      emailf.sendKeys("user3@live.com");
      Thread.sleep(2000);
      passf.sendKeys("123456");
      Thread.sleep(2000);
      conpassf.sendKeys("123456");
      Thread.sleep(2000);
      regbtn.click();
      continu.click();
      Thread.sleep(3000);
      loginbtn.click();
      emailIputField.sendKeys("user3@live.com");
      passwordInputFiled.sendKeys("123456");
      LoginBtn.click();
      Thread.sleep(2000);
      myaccount.click();
      Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/customer/info");
}
   public void testcase002() throws InterruptedException {
	   registerbtn.click();
	      firstn.sendKeys("user");
	      lastn.sendKeys("user");
	      Thread.sleep(2000);
	      emailf.sendKeys("legend3@email.com");
	      Thread.sleep(2000);
	      passf.sendKeys("123456");
	      Thread.sleep(2000);
	      conpassf.sendKeys("123456");
	      Thread.sleep(2000);
	      regbtn.click();
	      continu.click();
	      Thread.sleep(3000);
	      loginbtn.click();
	      emailIputField.sendKeys("legend3@email.com");
	      passwordInputFiled.sendKeys("123456");
	      LoginBtn.click();
	      Thread.sleep(2000);
	      myaccount.click();
	      Thread.sleep(2000);
	      emailf.clear();
	      emailf.sendKeys("legendone@email.com");
	      save.click();
	      Thread.sleep(2000);
	      logout.click();
	      Thread.sleep(2000);
	      loginbtn.click();
	      emailIputField.sendKeys("legendone@email.com");
	      passwordInputFiled.sendKeys("123456");
	      LoginBtn.click();
	      
   }
   public void testcase003() throws InterruptedException {
	   registerbtn.click();
	      firstn.sendKeys("user");
	      lastn.sendKeys("user");
	      Thread.sleep(2000);
	      emailf.sendKeys("legend4@email.com");
	      Thread.sleep(2000);
	      passf.sendKeys("123456");
	      Thread.sleep(2000);
	      conpassf.sendKeys("123456");
	      Thread.sleep(2000);
	      regbtn.click();
	      continu.click();
	      Thread.sleep(3000);
	      loginbtn.click();
	      emailIputField.sendKeys("legend4@email.com");
	      passwordInputFiled.sendKeys("123456");
	      LoginBtn.click();
	      Thread.sleep(2000);
	      myaccount.click();
	      download.click();
	      Assert.assertEquals(nodata.getText(), "There are no downloadable products");
   }
   public void testcase007() throws InterruptedException {
	   registerbtn.click();
	      firstn.sendKeys("user");
	      lastn.sendKeys("user");
	      Thread.sleep(2000);
	      emailf.sendKeys("legend5@email.com");
	      Thread.sleep(2000);
	      passf.sendKeys("123456");
	      Thread.sleep(2000);
	      conpassf.sendKeys("123456");
	      Thread.sleep(2000);
	      regbtn.click();
	      continu.click();
	      Thread.sleep(3000);
	      loginbtn.click();
	      emailIputField.sendKeys("legend5@email.com");
	      passwordInputFiled.sendKeys("123456");
	      LoginBtn.click();
	      Thread.sleep(2000);
	      myaccount.click();
	      backtostock.click();
	      Assert.assertEquals(nodata.getText(), "You are not currently subscribed to any Back In Stock notification lists");
   }
   public void testcase010() throws InterruptedException {
	   registerbtn.click();
	      firstn.sendKeys("user");
	      lastn.sendKeys("user");
	      Thread.sleep(2000);
	      emailf.sendKeys("legend7@email.com");
	      Thread.sleep(2000);
	      passf.sendKeys("123456");
	      Thread.sleep(2000);
	      conpassf.sendKeys("123456");
	      Thread.sleep(2000);
	      regbtn.click();
	      continu.click();
	      Thread.sleep(3000);
	      loginbtn.click();
	      emailIputField.sendKeys("legend7@email.com");
	      passwordInputFiled.sendKeys("123456");
	      LoginBtn.click();
	      Thread.sleep(2000);
	      myaccount.click();
	      changepass.click();
	      oldpass.sendKeys("123456");
	      newpass.sendKeys("123456789");
	      connewpass.sendKeys("123456789");
	      changepassw.click();
	      Assert.assertEquals(passchange.getText(), "Password was changed");
   }}

