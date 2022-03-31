package com.mamatha.dev.automation.diggiboxAuto;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksOnFeature extends BaseDriverClass {

	@Before
	public void beforeScenarios() {
		setUp();
	}

	@After
	public void afterScenarios() {
		tearDown();
	}

}
