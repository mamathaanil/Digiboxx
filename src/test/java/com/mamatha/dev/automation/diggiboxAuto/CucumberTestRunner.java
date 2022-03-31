package com.mamatha.dev.automation.diggiboxAuto;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.mamatha.dev.automation.stepdefinitions" }, features = { "Features/" })

public class CucumberTestRunner {

}
