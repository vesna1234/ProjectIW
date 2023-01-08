package TestCases;

import org.testng.annotations.Test;

import Base.Base;
import PageObjectModel.HomePage;
import PageObjectModel.RegisterPage;
import TestData.TestDataRegister;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class RegisterTestCases extends Base {
	
	HomePage hp;
	RegisterPage rp;
	TestDataRegister td;
	
	
 @BeforeMethod
	  public void beforeMethod() {
		  openApplication();
		  hp = new HomePage();
		  rp = new RegisterPage();
		  td= new TestDataRegister();
		  	  
	  }
	
  @Test
  public void RegisterNewUserWithValidEmail() throws InterruptedException {
	  hp.navigateToLoginPage();
	  rp.RegisterWithWalidEmail(td.firstname,td.lastname,td.day,td.month,td.year,td.email,td.pass,td.conpass);
	  
	  
  }
 @Test
 public void RegisterNewUserWithInvalidEmail() throws InterruptedException {
	 hp.navigateToLoginPage();
	 rp.RegisterNewUserWithInvalidEmail(td.firstname, td.lastname, td.day, td.month, td.year, td.invalidemial, td.pass, td.conpass);
 }
@Test
public void RegisterWithExistingEmail() throws InterruptedException {
	hp.navigateToLoginPage();
	rp.RegisterUserWithExisistingEmail(td.firstname, td.lastname, td.day, td.month, td.year, td.existingemail, td.pass, td.conpass);
}
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
