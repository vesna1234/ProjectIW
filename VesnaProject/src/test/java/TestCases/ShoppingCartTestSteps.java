package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Base.Base;
import PageObjectModel.HomePage;

public class ShoppingCartTestSteps extends Base {
	HomePage hp;
	PageObjectModel.ShoppingCart sc;
@BeforeMethod
public void start() {
    openApplication();
	hp = new HomePage();
	sc = new PageObjectModel.ShoppingCart(); 
	 }
@Test

public void testcase1() throws InterruptedException {
	hp.navigateToLoginPage();
	sc.testcase001();
	
} 
@Test
public void testcase3() throws InterruptedException {
	hp.navigateToLoginPage();
	sc.testcase003();
}
@Test
public void testcase4() throws InterruptedException {
	hp.navigateToLoginPage();
	sc.testcase004();
}
@Test
public void testcase5() throws InterruptedException {
	hp.navigateToLoginPage();
	sc.testcase005();
	
}
@Test
public void testcase6() throws InterruptedException {
	hp.navigateToLoginPage();
	sc.testcase006();
}
@AfterMethod
public void afterMethod() {
	  driver.close();
}
}
