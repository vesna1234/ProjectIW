package TestCases;

import org.testng.annotations.Test;

import Base.Base;
import PageObjectModel.HomePage;
import PageObjectModel.SearchPage;
import TestData.TestData;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SearchTestCases extends Base{
	HomePage hp;
	SearchPage sp;
	TestData td;
	 @BeforeMethod
	  public void beforeMethod() {
		  openApplication(); 
		  hp = new HomePage();
		  sp = new SearchPage();
		  td = new TestData();
		  
		  
	  }
  @Test
  public void SearchProduct() {
	  hp.navigateToLoginPage();
	  sp.SearchProduct(td.searcf);
  }
 @Test
 public void SearcNonExsisting() {
	 hp.navigateToLoginPage();
	 sp.SearchNonExistedProduct(td.nonexis);
 }
@Test
public void SearcEmptySearch() {
	hp.navigateToLoginPage();
	sp.SearchfiledEmpthy();
}
@Test
public void SearchWithTwoCriteria() {
	hp.navigateToLoginPage();
	sp.SearchWithTwoCaracterd();
}
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
