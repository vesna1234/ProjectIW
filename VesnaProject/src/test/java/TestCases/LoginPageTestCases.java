package TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import Base.Base;
import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import TestData.TestData;

public class LoginPageTestCases extends Base {
	
	HomePage hp;
	LoginPage lp;
	TestData td;



@Before
public void start() {
	 openApplication();
	 hp = new HomePage();
	 lp = new LoginPage();
	 td = new TestData();
	 
 }

@Test
public void LoginWhitWalidCredencials() throws InterruptedException
{
	hp.navigateToLoginPage();
	lp.loginUser(td.validUserEmail, td.validPassword);
	
}
@Test 
public void  LoginWithInvalidEmail() throws InterruptedException {
	hp.navigateToLoginPage();
	lp.loginWithInvalidEmail(td.inValidUserName, td.validPassword);
}


@After
public void end() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}



}





