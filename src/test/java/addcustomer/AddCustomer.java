package addcustomer;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {
	static WebDriver driver;

	@Given("^I want to lanunch application$")
	public void i_want_to_lanunch_application() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/html/addcustomerpage.php");

	}

	@Given("^check title of the application$")
	public void check_title_of_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("^Fill the details$")
	public void fill_the_details() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("name")).sendKeys("sivasankar");
		driver.findElement(By.name("dob")).sendKeys("01/30/1995");
		driver.findElement(By.name("addr")).sendKeys("No.9b,Royal avenue,mettukuppom");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("Tamilnadu");
		driver.findElement(By.name("pinno")).sendKeys("600097");
		driver.findElement(By.name("telephoneno")).sendKeys("9788316155");
		driver.findElement(By.name("emailid")).sendKeys("sivasankartamu@gmail.com");
	}

	@When("^check box$")
	public void check_box() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//input[@name=\"rad1\"])[1]")).click();
	}

	@When("^submit cutomer details$")
	public void submit_cutomer_details() {
		// Write code here that turns the phrase above into concrete actions
		WebElement x = driver.findElement(By.name("sub"));
		System.out.println(x);
	}

	@Then("^customer validate$")
	public void customer_validate() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Add New Customer", driver.findElement(By.xpath("//p[@class='heading3']")).getText());
	}

	@Then("^cutomer detail execute$")
	public void cutomer_detail_execute() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("done");
	}

}
