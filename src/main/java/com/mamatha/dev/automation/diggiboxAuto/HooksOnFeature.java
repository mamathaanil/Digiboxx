package com.mamatha.dev.automation.diggiboxAuto;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksOnFeature extends BaseCombinedDriver {

	@Before
	public void beforeScenarios() {

		// setUp("BrowserStack");
		setUp("Emulator");
	}

	@After
	public void afterScenarios() throws InterruptedException {
		tearDown();
	}

}
