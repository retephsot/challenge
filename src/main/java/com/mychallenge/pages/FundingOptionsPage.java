package com.mychallenge.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mychallenge.locators.FundingOptionsPageLocators;
import com.mychallenge.pagebase.PageBase;
import com.mychallenge.util.SeleniumMethods;



public class FundingOptionsPage extends PageBase {
	
	public FundingOptionsPage(WebDriver driver) {
		super(driver);
	}
	
	public FundingOptionsPage verifyNaviationSuccessful(String menuSelection) {
		SeleniumMethods sel = new SeleniumMethods(driver);
		Assert.assertTrue(sel.getText(FundingOptionsPageLocators.SUB_HEADER_CSS).contains(menuSelection), "The expected text is not displayed in the sub header");		
		return this;
	}
	
	public FundingOptionsPage verifyPageTitle(String menuSelection) {
		SeleniumMethods sel = new SeleniumMethods(driver);
		Assert.assertTrue(sel.getTitle().contains(menuSelection), "The expected title did not display");
		return this;
	}

}
