package com.mamatha.dev.automation.utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mamatha.dev.automation.diggiboxAuto.BaseCombinedDriver;

public class WaitHandler extends BaseCombinedDriver {

	public static WebDriverWait wait;

	public static void waitForElement(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));

	}
}
