package runnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile\\LezDo.feature", 
glue = "stepDefinition",monochrome = true, plugin = {"html:Reports/APIreport", "json:Reports/APIreport.json", "junit:Reports/APIreport.xml"})
public class RunnerClass {
	//This is main class to run the test
	/*
	 * public static void main(String[] args) { Result result =
	 * JUnitCore.runClasses(RunnerClass.class);
	 * 
	 * for (Failure failure : result.getFailures()) {
	 * System.out.println(failure.toString()); }
	 * 
	 * System.out.println("Test successful: " + result.wasSuccessful()); }
	 */
	/*
	 * public static void main(String[] args) { // Using JUnitCore to run the
	 * Cucumber tests programmatically Main.main(args);
	 * System.out.println("Test Completed!!!"); }
	 */
	
}
