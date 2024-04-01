package Runner;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features = {"Feature\\Login.feature"},
glue = {"stepdefinitions"},
dryRun = false,
plugin = {"pretty","html:target/cucu-report.html","json:target/cuc"}
//,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//"org.simplestudio.cucumber.XlsFormatter"}
,monochrome = true
		,publish = true)
 
public class runner extends AbstractTestNGCucumberTests{
}