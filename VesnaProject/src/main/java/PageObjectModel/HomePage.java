package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class HomePage extends Base {
	
	
	@FindBy(xpath="//img[@alt=\"nopCommerce demo store\"]")
	WebElement loginLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToLoginPage() {
		loginLink.click();
	}
	
	


}
