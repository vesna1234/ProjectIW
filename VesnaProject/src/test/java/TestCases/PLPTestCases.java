package TestCases;

import org.testng.annotations.Test;

import Base.Base;
import PageObjectModel.HomePage;
import PageObjectModel.PLPPage;
import TestData.TestData;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PLPTestCases extends Base{
	
	HomePage hp;
	PLPPage plp;
	TestData td;
	
	
	@BeforeMethod
	  public void beforeMethod() {
		openApplication();
		hp = new HomePage();
		plp = new PLPPage();
		td= new TestData();
		
		
	  }
	
  @Test
  public void confirmHPNotebook() {
	  hp.navigateToLoginPage();
	  plp.ConfirmHPNotebooks();
  }
  
  @Test
  public void AddToCart() {
	  
	 hp.navigateToLoginPage();
	 plp.AddToCartWithAvaliableProduct();
	 
  }
  
  @Test
  public void AddToWishList() {
	  hp.navigateToLoginPage();
	  plp.AddToWishList();
  }
  @Test
  public void compareTwoProduct() throws InterruptedException {
	  hp.navigateToLoginPage();
	  plp.CompareList();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
