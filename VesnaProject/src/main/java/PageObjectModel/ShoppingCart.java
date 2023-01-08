package PageObjectModel;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Base;

public class ShoppingCart extends Base{
	
	@FindBy(xpath="(//a[@href=\"/apparel\"])[1]")
	WebElement apparel;
	@FindBy(xpath="(//a[@href=\"/clothing\"])[4]")
	WebElement clothing;
	@FindBy(xpath="(//a[@href=\"/levis-511-jeans\"])[2]")
	WebElement levis;
    @FindBy(xpath="(//button[@type=\"button\"])[1]")
    WebElement addtocart;
    @FindBy(xpath="(//a[@href=\"/cart\"])[1]")
    WebElement shoppingcart;
    @FindBy(xpath="//input[@class=\"qty-input\"]")
    WebElement qny;
    @FindBy(xpath="(//button[@type=\"submit\"])[2]")
    WebElement update;
    @FindBy(xpath="(//a[@href=\"/books\"])[1]")
	 WebElement books;
    @FindBy(xpath="(//button[@type=\"button\"])[7]")
    WebElement addcart;
    @FindBy(xpath="//div[@class=\"no-data\"]")
    WebElement mesagge;
    @FindBy(xpath="(//button[@type=\"button\"])[4]")
    WebElement addtocartlevis;
    @FindBy(xpath="(//button[@type=\"button\"])[4]")
    WebElement addlevis;
    @FindBy(xpath="(//a[@href=\"/custom-t-shirt\"])[1]")
    WebElement custom;
    @FindBy(xpath="//input[@name=\"product_attribute_12\"]")
    WebElement text;
    @FindBy(xpath="(//button[@type=\"button\"])[1]")
    WebElement addcartcustom;
    @FindBy(xpath="//div[2]/a")
    WebElement edit;
    @FindBy(xpath="(//button[@type=\"button\"])[2]")
    WebElement updatee;
    @FindBy(xpath="(//div[@class=\"attributes\"])[2]")
    WebElement customtext;
    @FindBy(xpath="//span[@class=\"product-subtotal\"]")
    WebElement price;
    
    
    
    
    public ShoppingCart() {
    	PageFactory.initElements(driver, this);}
    
  public void testcase001() throws InterruptedException {
    	apparel.click();
    	clothing.click();
    	levis.click();
    	Thread.sleep(2000);
    	addtocart.click();
    	Thread.sleep(2000);
    	shoppingcart.click();
    	Thread.sleep(2000);

}
  public void testcase003() throws InterruptedException {
	  books.click();
	  addcart.click();
	  Thread.sleep(2000);
	  shoppingcart.click();
	  qny.clear();
	  qny.sendKeys("0");
	  update.click();
	  Assert.assertEquals(mesagge.getText(), "Your Shopping Cart is empty!");
  }
  public void testcase004() throws InterruptedException {
	  apparel.click();
  	  clothing.click();
  	  addtocartlevis.click();
  	  Thread.sleep(3000);
  	  addlevis.click();
  	  Thread.sleep(3000);
  	  shoppingcart.click();
  	  Thread.sleep(2000);
  	  Assert.assertEquals(qny.getText(), "2");
  }
  public void testcase005() throws InterruptedException {
	  apparel.click();
  	  clothing.click();
  	  Thread.sleep(2000);
  	  custom.click();
  	  text.sendKeys("Mombasa");
  	  addcartcustom.click();
  	  Thread.sleep(2000);
  	  shoppingcart.click();
  	  Assert.assertEquals(customtext.getText(),"Custom Text: Mombasa");
  	  
  	  edit.click();
  	  Thread.sleep(3000);
  	  text.clear();
  	  text.sendKeys("Jimmy's");
  	  updatee.click();
  	  Thread.sleep(2000);
  	  shoppingcart.click();
  	  Assert.assertEquals(customtext.getText(),"Custom Text: Jimmy's");
  	
  	  
  }
  public void testcase006() throws InterruptedException {
	  apparel.click();
  	  clothing.click();
  	  Thread.sleep(2000);
  	  custom.click();
  	  text.sendKeys("Mombasa");
  	  addcartcustom.click();
  	  Thread.sleep(2000);
  	  shoppingcart.click();
  	  qny.clear();
  	  qny.sendKeys("10");
  	  update.click();
  	  Assert.assertEquals(price.getText(), "$150.00");
  }}
