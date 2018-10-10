package org.siva.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Bank {
	static WebDriver driver;
	@Given("^Lauchbrowser$")
	public void lauchbrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
	    
	}

	@When("^Login credit$")
	public void login_credit(DataTable arg1) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys("mngr157083");
		driver.findElement(By.name("password")).sendKeys("uvUgupA");
	    
	}

	@When("^Click login$")
	public void click_login()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("btnLogin")).click();
	    
	}

	@Then("^test is this correct$")
	public void test_is_this_correct()  {
	  Assert.assertEquals("Welcome To Manager's Page of GTPL Bank",driver.findElement(By.tagName("marquee")).getText() );	    
	}


}
