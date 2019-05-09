package com.mychallenge.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mychallenge.locators.SupportPageLocators;
import com.mychallenge.pagebase.PageBase;
import com.mychallenge.util.SeleniumMethods;

public class SupportPage extends PageBase {
	
	public SupportPage(WebDriver driver) {
		super(driver);
	}
	
	public SubmitRequestPage navigateToSubmitRequestPage() {
		
		SeleniumMethods sel = new SeleniumMethods(driver);
		sel.selClickBy(SupportPageLocators.SUBMIT_A_REQUEST_LINK_TEXT);		
		return new SubmitRequestPage(driver);
		
	}
	
	public SupportPage verifyRequestSuccessfullySubmitted(String notification) {
		
		SeleniumMethods sel = new SeleniumMethods(driver);
		Assert.assertTrue(sel.getText(SupportPageLocators.REQUEST_SUCCESSFULLY_SUBMITTED_NOTIFICATION_X)
				.contains(notification), "The expected notification did not display!");	
		return this;
	}

}
