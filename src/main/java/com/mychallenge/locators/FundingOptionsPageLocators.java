package com.mychallenge.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mychallenge.pagebase.PageBase;

public class FundingOptionsPageLocators extends PageBase {
	
	public FundingOptionsPageLocators(WebDriver driver) {
		super(driver);
	}
	
	public static final By SUB_HEADER_CSS = By.cssSelector(".subheader");
	
	

}
