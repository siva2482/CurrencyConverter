package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks {
	public static WebDriver driver;
	@Before(order=0)
	public void beforeScenario(Scenario sc)
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
	System.out.println("Before Test");
	System.out.println("*************"+sc.getName());
	}
	@After
	public void afterScenario()
	{
		System.out.println("After  Test");
	}
	
}



