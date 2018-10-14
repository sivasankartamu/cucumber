package addcustomer;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddNewCutomer {
	
	@Given("^The user login to the guru login$")
	public void the_user_login_to_the_guru_login(DataTable t) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		List<String> log = t.asList(String.class);
	    Base.driver.findElement(By.name("uid")).sendKeys(log.get(0));
	    Base.driver.findElement(By.name("password")).sendKeys(log.get(1));
	    Base.driver.findElement(By.name("btnLogin")).click();
	}

	@Given("^The user navigate add customer page$")
	public void the_user_navigate_add_customer_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals("Welcome To Manager's Page of GTPL Bank",Base.driver.findElement(By.tagName("marquee")).getText());
	    Base.driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	}

	@When("^The user add the customer detatail \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void the_user_add_the_customer_detatail_and(String name, String gender, String dob, String address, String city, String state, String pin, String mob, String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Base.driver.findElement(By.name("name")).sendKeys(name);
		Base.driver.findElement(By.xpath("(//input[@name=\"rad1\"])")).sendKeys(gender);
		Base.driver.findElement(By.name("dob")).sendKeys(dob);
		Base.driver.findElement(By.name("addr")).sendKeys(address);
		Base.driver.findElement(By.name("city")).sendKeys(city);
		Base.driver.findElement(By.name("state")).sendKeys(state);
		Base.driver.findElement(By.name("pinno")).sendKeys(pin);
		Base.driver.findElement(By.name("telephoneno")).sendKeys(mob);
		Base.driver.findElement(By.name("emailid")).sendKeys(email);
	}

	@When("^The user submit and reset on the page$")
	public void the_user_submit_and_reset_on_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement submit = Base.driver.findElement(By.name("sub"));
		System.out.println(submit);
		WebElement reset = Base.driver.findElement(By.name("res"));
		System.out.println(reset);
	    
	}

	@Then("^The user validate details$")
	public void the_user_validate_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Add New Customer", Base.driver.findElement(By.xpath("//p[@class='heading3']")).getText());
	    
	}

	@Then("^The user generate the reports$")
	public void the_user_generate_the_reports() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The project is done..");
	}



}
