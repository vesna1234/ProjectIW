package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import PageObjectModel.HomePage;


public class CheckoutTestCases extends Base {
	HomePage hp;
	PageObjectModel.Checkout sc;
	
	@BeforeMethod
	 public void start() {
		     openApplication();
			 hp = new HomePage();
			sc = new PageObjectModel.Checkout();
			 
		 
		  }
		
 @Test
	  public void Zadaca1() throws InterruptedException {
		  hp.navigateToLoginPage();
		  sc.zadaca1();
	 }
 
 @Test
		  public void zadaca2() {
		 	 hp.navigateToLoginPage();
		 	 sc.zadaca2();}
 
@Test 
public void zadaca3() throws InterruptedException {
	hp.navigateToLoginPage();
	sc.zadaca3();
	
}

@Test
public void zadaca4() throws InterruptedException {
	hp.navigateToLoginPage();
	sc.zadaca4();
}

@AfterMethod
public void afterMethod() {
	  driver.close();
}}
