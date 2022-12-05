package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\CurrencyConverter\\src\\test\\java\\Feature\\convert.feature",
		glue={"StepDef"}
		)
public class Runner {

}
