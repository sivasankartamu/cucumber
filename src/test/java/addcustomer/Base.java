package addcustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Base {
	public static WebDriver driver;
	@Before
	public void launchBrowser () {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		

	}
	@After
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();

	}

}
