package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Base;

public class PDPPage extends Base {
	
	@FindBy(xpath="(//a[@href=\"/computers\"])[1]")
	 WebElement computer;
	 @FindBy(xpath="(//a[@href=\"/notebooks\"])[4]")
	 WebElement notebook;
     @FindBy(xpath="(//a[@href=\"/asus-n551jk-xo076h-laptop\"])[2]")
     WebElement asus;
     @FindBy(xpath="(//a[@href=\"/electronics\"])[3]")
	 WebElement electronics;
     @FindBy(xpath="(//a[@href=\"/camera-photo\"])[4]")
	 WebElement camera;
     @FindBy(xpath="(//a[@href=\"/leica-t-mirrorless-digital-camera\"])[1]")
     WebElement leica;
     @FindBy(xpath="(//a[@href=\"/productreviews/16\"])[2]")
     WebElement addreviews;
     @FindBy(xpath="//div[@class=\"message-error validation-summary-errors\"]")
     WebElement messageerror;
     @FindBy(xpath="(//a[@href=\"/desktops\"])[4]")
     WebElement desktops;
     @FindBy(xpath="(//a[@href=\"/build-your-own-computer\"])[2]")
     WebElement buildcomp;
     @FindBy(xpath="(//button[@type=\"button\"])[1]")
     WebElement addcart;
     @FindBy(xpath="//select[@data-attr=\"2\"]")
     WebElement ram;
     @FindBy(xpath="//div[@class=\"bar-notification error\"]")
     WebElement errmsg;
    @FindBy(xpath="//img[@alt=\"Picture of Asus N551JK-XO076H Laptop\"]")
    WebElement imgasus;
    @FindBy(xpath="//button[@title=\"Close (Esc)\"]")
    WebElement esc;
     
     
     
     
     

public PDPPage () {
	PageFactory.initElements(driver, this);
}
public void OpenProductDetailis() throws InterruptedException {
	computer.click();
	notebook.click();
	Thread.sleep(2000);
	asus.click();
	Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/asus-n551jk-xo076h-laptop");
	System.out.println("PDP for Asus is displyed");
}
public void WriteSubmith() {
	electronics.click();
	camera.click();
	leica.click();
	addreviews.click();
	Assert.assertEquals(messageerror.getText(), "Only registered users can write reviews");
}
public void CostumConfiguratio() throws InterruptedException {
	computer.click();
	desktops.click();
	buildcomp.click();
	addcart.click();
	Thread.sleep(2000);
	ram.click();
	Thread.sleep(2000);
	Assert.assertEquals(errmsg.getText(),"Please select RAM\r\n"
			+ "Please select HDD");
	
}

public void CheckIfLargeImage() throws InterruptedException {
	computer.click();
	notebook.click();
	Thread.sleep(2000);
	asus.click();
	Thread.sleep(2000);
	imgasus.click();
	Thread.sleep(2000);
	esc.click();
	Thread.sleep(2000);
	Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/asus-n551jk-xo076h-laptop");
	System.out.println("Product details for laptop asus is displayed ");
}


}