package com.magna.bdd.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./res/features", glue = "com.magna.bdd.steps", plugin = { "pretty",
		"json:target/cucumber-jvm-report/cucumber.json"}, monochrome = true, tags = {"@Regression"})
public class TestRunner {

}
