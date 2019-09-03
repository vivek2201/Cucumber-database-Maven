package CucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Features",
		glue="StepDefinition")
public class TestRunner extends AbstractTestNGCucumberTests//added AbstractTestNGCucumberTests to testrunner file with TestNg xml file
{

}
