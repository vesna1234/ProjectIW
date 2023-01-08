package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Base.Base;

public class Checkout extends Base{
	
	public Checkout () {
		PageFactory.initElements(driver, this);}
	
	 @FindBy(xpath="(//a[@href=\"/computers\"])[1]")
	 WebElement computer;
	  @FindBy(xpath="(//a[@href=\"/software\"])[4]")
	 WebElement software;
	 @FindBy(xpath="(//button[@type=\"button\"])[5]")
	 WebElement addcart;
	 @FindBy(xpath="(//a[@href=\"/cart\"])[1]")
	WebElement shoppingc;
	 @FindBy(xpath="//input[@id=\"termsofservice\"]")
	 WebElement agree;
	 @FindBy(xpath="(//button[@type=\"submit\"])[6]")
	 WebElement submit;
	 
	 
	 //testcase 002
	 @FindBy(xpath="(//a[@href=\"/cart\"])[1]")
	 WebElement shopcart;
	 @FindBy(xpath="//div[@class=\"no-data\"]")
	 WebElement messagge;
	 //testcase 003
	 @FindBy(xpath="(//button[@type=\"button\"])[2]")
	 WebElement guest;
	
	//testcase 006
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	WebElement firstname;
	@FindBy(xpath="(//input[@type=\"text\"])[3]")
	WebElement lastname;
	@FindBy(xpath="(//input[@type=\"email\"])[1]")
	WebElement email;
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement country;

	@FindBy(xpath="(//input[@type=\"text\"])[5]")
	WebElement city;
	@FindBy(xpath="(//input[@type=\"text\"])[6]")
	WebElement adress;
	@FindBy(xpath="(//input[@type=\"text\"])[8]")
	WebElement zip;
	@FindBy(xpath="//input[@type=\"tel\"]")
	WebElement phone;
	@FindBy(xpath="(//button[@type=\"button\"])[5]")
	WebElement contin;
	@FindBy(xpath="(//button[@type=\"button\"])[10]")
	WebElement con1;
	@FindBy(xpath="(//div[@class=\"payment-logo\"])[2]")
	WebElement creditcart;
	@FindBy(xpath="(//button[@type=\"button\"])[11]")
	WebElement con;
	@FindBy(xpath="(//input[@type=\"text\"])[10]")
	WebElement cardname;
	@FindBy(xpath="(//input[@type=\"text\"])[11]")
	WebElement cardnumb;
	@FindBy(xpath="(//input[@type=\"text\"])[12]")
	WebElement code;
	@FindBy(xpath="(//button[@type=\"button\"])[12]")
	WebElement continu;
	@FindBy(id="CreditCardType")
	WebElement visa;
	@FindBy(id="ExpireMonth")
	WebElement month;
	@FindBy(id="ExpireYear")
	WebElement year;
	@FindBy(xpath="(//button[@type=\"button\"])[12]")
	WebElement conti1;
	@FindBy(xpath="(//button[@type=\"button\"])[14]")
	WebElement cont2;


	public void zadaca1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		computer.click();
		Thread.sleep(2000);
		software.click();
		Thread.sleep(2000);
		addcart.click();
		Thread.sleep(2000);
		shoppingc.click();
		agree.click();
		submit.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/login/checkoutasguest?returnUrl=%2Fcart");

		
	}
	public void zadaca2() {
		shopcart.click();
		Assert.assertEquals(messagge.getText(), "Your Shopping Cart is empty!");
		
	}
	public void zadaca3() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		computer.click();
		Thread.sleep(2000);
		software.click();
		Thread.sleep(2000);
		addcart.click();
		Thread.sleep(2000);
		shoppingc.click();
		agree.click();
		submit.click();
		guest.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/onepagecheckout#opc-billing");
		
	}
	public void zadaca4()throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		computer.click();
		Thread.sleep(2000);
		software.click();
		Thread.sleep(2000);
		addcart.click();
		Thread.sleep(2000);
		shoppingc.click();
		agree.click();
		submit.click();
		guest.click();
		firstname.sendKeys("Ivan");
		lastname.sendKeys("Ivanov");
		email.sendKeys("ivanovivan@email.com");
		Select select = new Select(country);
		select.selectByValue("219");
		Thread.sleep(3000);
		city.sendKeys("Moscow");
		adress.sendKeys("Leninsky Ave 20");
		zip.sendKeys("101000");
		phone.sendKeys("787-0000");
		contin.click();
		con1.click();
		creditcart.click();
		con.click();
		Thread.sleep(2000);

		Select select1 = new Select (visa);
		select1.selectByValue("MasterCard");
		cardname.sendKeys("Ivan Ivanov");
		
		cardnumb.sendKeys("5159661410754896");
		Thread.sleep(2000);
		Select select2 = new Select(month);
		select2.selectByValue("1");
		Thread.sleep(2000);
		Select select3 = new Select(year);
		select3.selectByValue("2024");
		code.sendKeys("164");
		continu.click();
		conti1.click();
		  Thread.sleep(2000);
		cont2.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/checkout/completed");
		
	}}




