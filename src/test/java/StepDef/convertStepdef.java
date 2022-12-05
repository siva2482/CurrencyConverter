package StepDef;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import Pages.converterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class convertStepdef {
	public WebDriver driver;
	converterPage obj;
	public convertStepdef()
	{
		driver=hooks.driver;
		obj=new converterPage(driver);
	}
	@Given("user navigates to url")
	public void user_navigates_to_url() {
	    // Write code here that turns the phrase above into concrete actions
		
	//	driver=new ChromeDriver();
	    driver.get("https://www.xe.com/currencyconverter/");
	}
	@When("user enters the {string} and enters {string} , {string} and  press convert")
	public void user_enters_the_and_enters_and_press_convert(String string, String string2, String string3) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    obj.convertMoney(string,string2,string3);
	    obj.chartclick();
	}
	

	/*@When("user enters the amount and press convert")
	public void user_enters_the_amount_and_press_convert() {
	    // Write code here that turns the phrase above into concrete actions
	   obj.convertMoney();
	   obj.chartclick();
	}*/

	@Then("usr verifies the value")
	public void usr_verifies_the_value() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		obj.verifyAmount();
	 System.out.println("worked");  
	}

}
