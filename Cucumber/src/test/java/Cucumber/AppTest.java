package Cucumber;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

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

public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
