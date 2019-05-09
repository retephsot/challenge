package com.mychallenge.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mychallenge.helper.Waits;
import com.mychallenge.pagebase.PageBase;

public class SeleniumMethods extends PageBase {
	
	public SeleniumMethods(WebDriver driver) {
		super(driver);
	}
	
		
		
	public void selClickBy(By byElemLocator) {
		Waits wait = new Waits(driver);
		wait.waitForElementClickableBy(byElemLocator);
		driver.findElement(byElemLocator).click();
	}
		
	public void selClearFieldBy(By byElemLocator) {
		Waits wait = new Waits(driver);
		wait.waitForVisibilityOfElementBy(byElemLocator);
		driver.findElement(byElemLocator).clear();
	}
	
	public void selSendKeysBy(By byElemLocator, String inputStr) {
		Waits wait = new Waits(driver);
		wait.waitForVisibilityOfElementBy(byElemLocator);
		driver.findElement(byElemLocator).sendKeys(inputStr);
	}

	public WebElement getWebElement(By byElemLocator) {
		Waits wait = new Waits(driver);
		wait.waitForVisibilityOfElementBy(byElemLocator);
		return driver.findElement(byElemLocator);
	}
	
	public String getText(By byElemLocator) {
		Waits wait = new Waits(driver);
		wait.waitForVisibilityOfElementBy(byElemLocator);
		return driver.findElement(byElemLocator).getText();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void actionsMoveToElementBy(By byElemLocator) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(byElemLocator)).build().perform();
	}
	
	public void actionsMoveToElementClickBy(By byElemLocator) {
		Waits wait = new Waits(driver);
		wait.waitForVisibilityOfElementBy(byElemLocator);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(byElemLocator)).click().build().perform();
	}
	
	public void jsClick(By byElemLocator) {
		Waits wait = new Waits(driver);
		wait.waitForVisibilityOfElementBy(byElemLocator);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(byElemLocator));	
	}
	
	public void jsScroll(By byElemLocator) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byElemLocator));
	}
	
	public int findTotalElementCount(By elemLocator) {
		return driver.findElements(elemLocator).size();
	}

}
