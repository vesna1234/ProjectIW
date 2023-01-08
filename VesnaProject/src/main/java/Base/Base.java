package Base;

import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public String homeUrl = "https://demo.nopcommerce.com/";
	String browser = "firefox";
public void openApplication() {

	
	if (browser=="chrome") {
		  driver=WebDriverManager.chromedriver().create();
	  }
	else if (browser=="firefox") {
		driver=WebDriverManager.firefoxdriver().create();
	}
	else if(browser=="edge") {
		driver=WebDriverManager.edgedriver().create();
	}
	else {
		System.out.println("There is no valid browser");
	}
	driver.get(homeUrl);
	driver.manage().window().maximize();
	
	
}

}

		

	


