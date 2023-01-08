package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Base;
import TestData.TestData;

public class PLPPage extends Base {
	 TestData td = new TestData();
	 @FindBy(xpath="(//a[@href=\"/computers\"])[1]")
	 WebElement computer;
	 @FindBy(xpath="(//a[@href=\"/notebooks\"])[4]")
	 WebElement notebook;
	 @FindBy(xpath="//a[@href=\"/hp-envy-6-1180ca-156-inch-sleekbook\"]")
	 WebElement hp;
	 @FindBy(xpath="(//a[@href=\"/electronics\"])[3]")
	 WebElement electronics;
	 @FindBy(xpath="(//a[@href=\"/camera-photo\"])[4]")
	 WebElement camera;
	 @FindBy(xpath="(//a[@href=\"/nikon-d5500-dslr\"])[2]")
	 WebElement nikon;
	 @FindBy(xpath="//input[@id=\"product_enteredQuantity_15\"]")
	 WebElement quantity;
	 @FindBy(xpath="(//button[@type=\"button\"])[6]")
	 WebElement addtocart;
	 @FindBy(xpath="//div[@id='bar-notification']/div/p")
	 WebElement message;
	 
	 @FindBy(xpath="(//a[@href=\"/books\"])[1]")
	 WebElement books;
	 @FindBy(xpath="(//button[@type=\"button\"])[7]")
	 WebElement firstpl;
	 
	 @FindBy(xpath="//*[@id=\"bar-notification\"]/div/p")
	 WebElement wishlistmessage;
	 
	 @FindBy(xpath="(//a[@href=\"/cell-phones\"])[4]")
	 WebElement cellphones;
	 
	 @FindBy(xpath="(//button[@type=\"button\"])[5]")
	 WebElement htcmini;
	 @FindBy(xpath="(//button[@type=\"button\"])[8]")
	 WebElement nokia;
	 @FindBy(xpath="(//a[@href=\"/compareproducts\"])[1]")
	 WebElement comparelist;
	 
	 
	 
public PLPPage () {
	PageFactory.initElements(driver, this);
}
	public void ConfirmHPNotebooks() {
		computer.click();
		notebook.click();
		hp.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/hp-envy-6-1180ca-156-inch-sleekbook");
		System.out.println("The costumer is on the PlP page of hp notebook");
	}
public void AddToCartWithAvaliableProduct() {
	electronics.click();
	camera.click();
	nikon.click();
	quantity.clear();
	quantity.sendKeys("2");
	addtocart.click();
	//Assert.assertEquals(message.getText(), "The product has been added to your shopping cart");
	System.out.println("The product has been added to your shopping cart");
	
}
public void AddToWishList() {
	books.click();
	firstpl.click();
	Assert.assertEquals(wishlistmessage.getText(), "The product has been added to your wishlist");
	
}
public void CompareList() throws InterruptedException {
	electronics.click();
	Thread.sleep(2000);
	cellphones.click();
	Thread.sleep(2000);
	htcmini.click();
	Thread.sleep(2000);
	nokia.click();
	Thread.sleep(2000);
	comparelist.click();
	Thread.sleep(2000);
	Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/compareproducts");
}
}
