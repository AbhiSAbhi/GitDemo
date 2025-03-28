package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome = true,
//tags="@SmokeTest and @RegressionTest")

//@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome = true,
//tags="not @RegressionTest")

//@CucumberOptions(features="src/test/java/features", dryRun=true, glue="stepDefinitions", monochrome = true)

@CucumberOptions(features="src/test/java/features",dryRun=true, glue="stepDefinitions", monochrome = true,
tags="@SmokeTest or @RegressionTest", plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"})
public class TestNGRunnerNew extends AbstractTestNGCucumberTests
{

}
