package TestCases;

import org.testng.annotations.Test;

import Base.Base;
import PageObjectModel.HomePage;
import PageObjectModel.WishList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class WishListTestCases extends Base {
	HomePage hp;
	WishList wl;
	
	 @BeforeMethod
	  public void beforeMethod() {
		 openApplication();
		 hp= new HomePage();
		 wl = new WishList ();
		 
	  }
	
	
  @Test
  public void AddProductToCart() throws InterruptedException {
	  hp.navigateToLoginPage();
	  wl.AddProductTocart();
  }
  @Test
  public void QuantityIncreas() throws InterruptedException {
	  hp.navigateToLoginPage();
	  wl.QuantityIncrease();
  }
 @Test
 public void CheckAddProduct() throws InterruptedException {
	 hp.navigateToLoginPage();
	 wl.CheckAddProductTwoOrMoreTime();
 }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
