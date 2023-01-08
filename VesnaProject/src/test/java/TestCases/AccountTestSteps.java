package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Base.Base;
import PageObjectModel.HomePage;

public class AccountTestSteps extends Base{
	HomePage hp;
	PageObjectModel.Account accp;
	
	@BeforeMethod
	 public void start() {
		     openApplication();
			 hp = new HomePage();
			 accp = new PageObjectModel.Account();
		  }
	@Test 
	
	public void testcase001() throws InterruptedException {
		hp.navigateToLoginPage();
		accp.testcase001();
	}
	@Test 
	public void testcase002() throws InterruptedException {
		hp.navigateToLoginPage();
		accp.testcase002();
	}
	@Test
	public void testcase003() throws InterruptedException {
		hp.navigateToLoginPage();
		accp.testcase003();
	}
	@Test
	public void testcase007() throws InterruptedException {
		hp.navigateToLoginPage();
		accp.testcase007();	}
	@Test
	public void testcase010() throws InterruptedException {
		hp.navigateToLoginPage();
		accp.testcase010();
	}
	@AfterMethod
	public void afterMethod() {
		  driver.close();
	}

}
