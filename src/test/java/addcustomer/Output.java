package addcustomer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sivasankar\\Desktop\\Project\\Sample\\src\\test\\java\\addcustomer\\AddNewCustomer.feature", glue = {
		"addcustomer" }, plugin = { "html:target" })

public class Output {

}
