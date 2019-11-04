package Cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)

@CucumberOptions (
	features = {"src/test/java/Cucumber/featureFiles/"},
	glue = {"Cucumber.stepFiles"},
	monochrome = true,
	plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", 
			"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
)


public class MainRunnerTest {

}
