package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:Features"}, glue = {"StepDefinitions"},
                tags ="@Demo-auto" ,monochrome = true, dryRun = false,
                plugin = {"pretty","html:target/cucumber ", "json:target/cucumber.json"})
public class Mainrunner extends AbstractTestNGCucumberTests {

}
