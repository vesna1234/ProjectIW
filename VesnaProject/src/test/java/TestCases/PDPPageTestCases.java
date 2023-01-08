package TestCases;

import org.testng.annotations.Test;



import Base.Base;
import PageObjectModel.HomePage;

import PageObjectModel.PDPPage;
import TestData.TestData;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PDPPageTestCases extends Base{
	HomePage hp;
	PDPPage pdp;
	TestData td;
	
	@BeforeMethod
	  public void beforeMethod() {
		openApplication();
		hp= new HomePage();
		pdp = new PDPPage();
		td = new TestData();
		
	  }
	
		
  @Test
  public void OpenDetalPage() throws InterruptedException {
	
	  hp.navigateToLoginPage();
	  pdp.OpenProductDetailis();
	  
  }
  @Test
  public void WriteSubmit() {
	  hp.navigateToLoginPage();
	  pdp.WriteSubmith();
  }
  @Test
  
 public void CostumConfigurationProduct() throws InterruptedException {
	  hp.navigateToLoginPage();
	  pdp.CostumConfiguratio();
  }
  @Test
  public void CheckLargeImageOfProduct() throws InterruptedException {
	  hp.navigateToLoginPage();
	  pdp.CheckIfLargeImage();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
