package RunnerEbay;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Features\\advanced.feature" }, glue = { "step" }, plugin = {
		"pretty", "html:target/cucumber-reports.html" }, dryRun = false, monochrome = true, tags = "@regression")
public class RunnerAdvanced {

}