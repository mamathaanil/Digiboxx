package com.mamatha.dev.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mamatha.dev.automation.diggiboxAuto.BaseCombinedDriver;

public class FolderMenuPageFactory extends BaseCombinedDriver {

	@FindBy(id = "com.liqvd.digibox.test:id/ivMenu")
	@CacheLookup
	WebElement folderMenu;

	@FindBy(id = "com.liqvd.digibox.test:id/textView11")
	@CacheLookup
	WebElement renameOption;

	@FindBy(id = "com.liqvd.digibox.test:id/textView10")
	@CacheLookup
	WebElement changeColor;

	@FindBy(id = "com.liqvd.digibox.test:id/ivDelete")
	@CacheLookup
	WebElement deleteOption;

	@FindBy(id = "com.liqvd.digibox.test:id/textView9")
	@CacheLookup
	WebElement assignCreds;

	@FindBy(id = "com.liqvd.digibox.test:id/textView13")
	@CacheLookup
	WebElement download;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	public FolderMenuPageFactory() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}

	public WebElement getFolderMenu() {
		return folderMenu;
	}

	public WebElement getRenameOption() {

		return renameOption;
	}

	public WebElement getChangeColor() {
		return changeColor;
	}

	public WebElement getDeleteOption() {
		return deleteOption;
	}

	public WebElement getAssign() {
		return assignCreds;
	}

	public WebElement getDownload() {
		return download;
	}

	public WebElement getRenameFolderButton() {

		By byRenameButton = By.id("com.liqvd.digibox.test:id/btnReNameFolder");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byRenameButton));
		WebElement renameButton = driver.findElement(byRenameButton);
		return renameButton;
	}

	public WebElement getEditRenameFolder() {
		By byEditRename = By.id("com.liqvd.digibox.test:id/edtReNameFolder");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byEditRename));
		WebElement editRename = driver.findElement(byEditRename);
		return editRename;
	}

	public WebElement getColorPallete(int index) {
		// By byChooseColor = By.id("com.liqvd.digibox.test:id/colorPalette[" + index +
		// "]");
		By byChooseColor = By.xpath("//android.view.ViewGroup[" + index + "]");
		wait.until(ExpectedConditions.elementToBeClickable(byChooseColor));
		WebElement chooseColor = driver.findElement(byChooseColor);
		return chooseColor;
	}

	public WebElement getApplyBtn() {
		By byApplyBtn = By.id("com.liqvd.digibox.test:id/btnApply");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byApplyBtn));
		WebElement applyBtn = driver.findElement(byApplyBtn);
		return applyBtn;
	}

}
