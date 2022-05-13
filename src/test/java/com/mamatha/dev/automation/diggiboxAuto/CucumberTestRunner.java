package com.mamatha.dev.automation.diggiboxAuto;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.mamatha.dev.automation.stepdefinitions",
		"com.mamatha.dev.automation.diggiboxAuto" }, features = { "Features/" }, plugin = { "pretty",
				"junit:target/MyReports/report.xml", "json:target/MyReports/report.json",
				"html:target/MyReports/report.html" }, publish = true)

public class CucumberTestRunner {

}
