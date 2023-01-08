package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Base;

public class WishList extends Base {
	 @FindBy(xpath="(//a[@href=\"/books\"])[1]")
	 WebElement books;
	 @FindBy(xpath="(//button[@type=\"button\"])[6]")
	 WebElement addwishlist;
	 @FindBy(xpath="(//a[@href=\"/wishlist\"])[1]")
	 WebElement wishlist;
	 @FindBy(xpath="(//input[@type=\"checkbox\"])[1]")
	 WebElement checkbox;
	 @FindBy(xpath="(//button[@type=\"submit\"])[3]")
	 WebElement addtocart;
     @FindBy(xpath="(//input[@type=\"text\"])[2]")
     WebElement quantity;
     @FindBy(xpath="(//button[@type=\"submit\"])[2]")
     WebElement update;
     @FindBy(xpath="//span[@class=\"product-subtotal\"]")
     WebElement total;
     
     
public WishList() {
	PageFactory.initElements(driver, this);
}
public void AddProductTocart() throws InterruptedException {
	books.click();
	addwishlist.click();
	Thread.sleep(2000);
	wishlist.click();
	Thread.sleep(2000);
	checkbox.click();
	Thread.sleep(2000);
	addtocart.click();
	Thread.sleep(2000);
	Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/cart");
	
}

public void QuantityIncrease() throws InterruptedException {
	books.click();
	addwishlist.click();
	Thread.sleep(2000);
	wishlist.click();
	quantity.clear();
	quantity.sendKeys("5");
	update.click();
	
	Assert.assertEquals(total.getText(), "$255.00");
	
}

public void CheckAddProductTwoOrMoreTime() throws InterruptedException {
	books.click();
	addwishlist.click();
	Thread.sleep(2000);
	addwishlist.click();
	Thread.sleep(2000);
	addwishlist.click();
	Thread.sleep(2000);
	wishlist.click();
	Thread.sleep(2000);
	Assert.assertEquals(quantity.getText(),"3");
}
}

