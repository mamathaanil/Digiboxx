package com.mamatha.dev.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mamatha.dev.automation.diggiboxAuto.BaseCombinedDriver;

public class SubFolderPageFactory extends BaseCombinedDriver {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	public WebElement getImage(String imageName) {

		// By byImage = By.xpath("//android.widget.TextView[contains(@text,\"" +
		// imageName + "\")]");
		By byImage = By.xpath("//android.widget.TextView[@text=\"" + imageName + "\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byImage));
		WebElement image = driver.findElement(byImage);
		return image;
	}

	public boolean waitTillAllImagesLoad() {

		By byImages = By.id("com.liqvd.digibox.test:id/tvName");
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(byImages)));
		return true;
	}
}
