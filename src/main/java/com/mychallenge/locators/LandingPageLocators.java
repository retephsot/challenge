package com.mychallenge.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mychallenge.pagebase.PageBase;

public class LandingPageLocators extends PageBase {
	
	public LandingPageLocators(WebDriver driver) {
		super(driver);
	}
	
	public static final By FEATURES_LINK_X = By.xpath("//a[contains(text(),'Features')]");
	
	public static final By PRICES_LINK_X = By.xpath("//a[text()='Prices']");
	
	public static final By SUPPORT_LINK_X = By.xpath("//ul[@class='primary']//a[text()='Support']");
	

}
