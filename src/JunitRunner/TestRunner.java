package JunitRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import dataProvider.ConfigFileReader;

import java.io.*;
import stepDefinitions.*;

@RunWith(Cucumber.class)

@CucumberOptions(// features = "Feature", //the path of the feature file
		features = { "/Users/rajatbansal/eclipse-workspace/CucumberLearning/src/Features/MyLoginAccount.feature" }, // the
																													// path
		glue = { "stepDefinitions" }, // of
		// the
		// step
		// definition
		// files
		// format =
		// {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
//	dryRun = true, //to check the mapping is proper between feature file and step definition file
		// dryRun = false, //by default
		monochrome = true, // display the console output in proper readable format
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }
// format = {"pretty","html:test-output"}, //to generate different types of
// reporting //html,xml or json
// strict = false //it will check if any steps is not defined in the step
// definition
// tags = {"@SanityTest"} //execute only sanity test scenario
// tags = {"@SanityTest,@RegressionTest"} // execute sanity test scenario or
// regression test scenario.It follow OR operator
// tags = {"@SanityTest","@RegressionTest"} // execute sanity test scenario and
// regression test scenario
// tags = {"~@SanityTest"} ,// execute all tests except for Sanity test scenario

// tags = {"~@SanityTest,~@End2End"} // this will behave like AND in negotiate
// part
// tags = {"~@SanityTest","~@End2End"} // this will behave like OR in negotiate
// part
// tags = {"~@SanityTest"}
// plugin = { "pretty" } // give the output in console very pretty, it is same
// as format
)

public class TestRunner extends StepDefinitionsClass {

	@AfterClass
	public static void writeExtetReport() throws IOException {

		Reporter.loadXMLConfig(new File(StepDefinitionsClass.configFileReader.getExtentReport()));
	}

}