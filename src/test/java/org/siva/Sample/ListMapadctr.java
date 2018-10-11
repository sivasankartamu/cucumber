package org.siva.Sample;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListMapadctr {
	WebDriver driver;
	@Given("^Lauch browser$")
	public void lauch_browser()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
	}

	@Given("^login$")
	public void login(DataTable t)throws Throwable  {
	    List<String> log = t.asList(String.class);
	    driver.findElement(By.name("uid")).sendKeys(log.get(0));
	    driver.findElement(By.name("password")).sendKeys(log.get(1));
	    driver.findElement(By.name("btnLogin")).click();
	    Thread.sleep(3000);
	}

	@When("^Fill the form <name>and<dob>and<addr>and<city>and<state>and<pin>and<mob>and<email>$")
	public void fill_the_form(DataTable t) throws Throwable {
	    List<List<String>> fill = t.asLists(String.class);
	    driver.findElement(By.name("name")).sendKeys(fill.get(1).get(0));
		driver.findElement(By.name("dob")).sendKeys(fill.get(1).get(1));
		driver.findElement(By.name("addr")).sendKeys(fill.get(1).get(2));
		driver.findElement(By.name("city")).sendKeys(fill.get(1).get(3));
		driver.findElement(By.name("state")).sendKeys(fill.get(1).get(4));
		driver.findElement(By.name("pinno")).sendKeys(fill.get(1).get(5));
		driver.findElement(By.name("telephoneno")).sendKeys(fill.get(1).get(6));
		driver.findElement(By.name("emailid")).sendKeys(fill.get(1).get(7));
	}

	@When("^Check the box$")
	public void check()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//input[@name=\"rad1\"])[1]")).click();
	}

	@Then("^Submit and reset$")
	public void submit_and_reset()  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement x = driver.findElement(By.name("sub"));
		System.out.println(x);
		WebElement y = driver.findElement(By.name("reset"));
		System.out.println(y);
	}

	@Then("^Present value$")
	public void present_value()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
