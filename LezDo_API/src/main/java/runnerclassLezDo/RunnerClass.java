package runnerclassLezDo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:FeatureFile/LezDo_API.feature", glue = "lezdoStepDefinition",
monochrome = true, plugin = {"html:Reports/APIreport", "json:Reports/APIreport.json", "junit:Reports/APIreport.xml"})
public class RunnerClass {
	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("runnerclassLezDo.RunnerClass");
	    }
}
