package PageObjectModel;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Base;
import TestData.TestData;

public class SearchPage extends Base {
	TestData td = new TestData();
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement searchfield;
	@FindBy(xpath="(//button[@type=\"submit\"])[1]")
	WebElement search;
	@FindBy(xpath="//div[@class=\"no-result\"]")
	WebElement noresult;
	@FindBy(xpath="//div[@class=\"warning\"]")
	WebElement lesscriteria;
	public SearchPage() {
	PageFactory.initElements(driver, this);
	
}
	public void SearchProduct(String searcf) {
		searchfield.sendKeys(searcf);
		search.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=nike");
		System.out.println("The search product is showed");
		}
	public void SearchNonExistedProduct(String nonexis) {
		searchfield.sendKeys(nonexis);
		search.click();
		Assert.assertEquals(noresult.getText(), "No products were found that matched your criteria.");
		System.out.println("No product");

	}
	public void SearchfiledEmpthy() {
		//search.click();
		//WebElement  alert = driver.findElement(By.id("alertButton"));
		//lert.getText();
		//Assert.assertEquals(alert, "Please enter some search keyword");
	}
	public void SearchWithTwoCaracterd() {
		
		searchfield.sendKeys("hp");
		search.click();
		Assert.assertEquals(lesscriteria.getText(), "Search term minimum length is 3 characters");
		
		
		
	}
	}
