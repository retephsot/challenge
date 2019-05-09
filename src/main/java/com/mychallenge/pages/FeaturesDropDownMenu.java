package com.mychallenge.pages;

import org.openqa.selenium.WebDriver;

import com.mychallenge.helper.Waits;
import com.mychallenge.locators.FeaturesDropDownMenuLocators;
import com.mychallenge.pagebase.PageBase;
import com.mychallenge.util.SeleniumMethods;

public class FeaturesDropDownMenu extends PageBase {
	
	public FeaturesDropDownMenu(WebDriver driver) {
		super(driver);
	}
		
	final int maxWait = 10;
	
	public FundingOptionsPage navigateToFundingOptionsPage() {
		
		Waits wait = new Waits(driver);
		SeleniumMethods sel = new SeleniumMethods(driver);
		sel.selClickBy(FeaturesDropDownMenuLocators.FUNDING_OPTIONS_LINK_X);		
		return new FundingOptionsPage(driver);
	}
	
	public FeeSchedulePage navigateToFeeSchedulePage() {
		
		Waits wait = new Waits(driver);
		SeleniumMethods sel = new SeleniumMethods(driver);
		sel.selClickBy(FeaturesDropDownMenuLocators.FEE_SCHEDULE_PAGE_LINK_X);
		return new FeeSchedulePage(driver);
	}

}
