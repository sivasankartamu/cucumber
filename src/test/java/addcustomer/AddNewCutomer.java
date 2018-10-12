package addcustomer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddNewCutomer {
	WebDriver driver;
	@Given("^The user login to the guru login$")
	public void the_user_login_to_the_guru_login(DataTable t) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		List<String> log = t.asList(String.class);
	    driver.findElement(By.name("uid")).sendKeys(log.get(0));
	    driver.findElement(By.name("password")).sendKeys(log.get(1));
	    driver.findElement(By.name("btnLogin")).click();
	}

	@Given("^The user navigate add customer page$")
	public void the_user_navigate_add_customer_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals("Welcome To Manager's Page of GTPL Bank",driver.findElement(By.tagName("marquee")).getText());
	    driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	}

	@When("^The user add the customer detatail \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void the_user_add_the_customer_detatail_and(String name, String gender, String dob, String address, String city, String state, String pin, String mob, String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.xpath("(//input[@name=\"rad1\"])")).sendKeys(gender);
		driver.findElement(By.name("dob")).sendKeys(dob);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("pinno")).sendKeys(pin);
		driver.findElement(By.name("telephoneno")).sendKeys(mob);
		driver.findElement(By.name("emailid")).sendKeys(email);
	}

	@When("^The user submit and reset on the page$")
	public void the_user_submit_and_reset_on_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement submit = driver.findElement(By.name("sub"));
		System.out.println(submit);
		WebElement reset = driver.findElement(By.name("res"));
		System.out.println(reset);
	    
	}

	@Then("^The user validate details$")
	public void the_user_validate_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Add New Customer", driver.findElement(By.xpath("//p[@class='heading3']")).getText());
	    
	}

	@Then("^The user generate the reports$")
	public void the_user_generate_the_reports() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The project is done..");
	}



}
