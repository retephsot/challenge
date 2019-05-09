package com.mychallenge.pages;

import org.openqa.selenium.WebDriver;

import com.mychallenge.helper.Validation;
import com.mychallenge.locators.FeeSchedulePageLocators;
import com.mychallenge.pagebase.PageBase;
import com.mychallenge.util.SeleniumMethods;

public class FeeSchedulePage extends PageBase {
	
	public FeeSchedulePage(WebDriver driver) {
		super(driver);
	}
	
	public FeeSchedulePage scrollToMarginFeesDiv() {
		
		SeleniumMethods sel = new SeleniumMethods(driver);
		sel.jsScroll(FeeSchedulePageLocators.MARGIN_FEES_TABLE_LINK_X);		
		return this;
	}
	
	public FeeSchedulePage openMarginFeesTable() {
		
		SeleniumMethods sel = new SeleniumMethods(driver);
		sel.selClickBy(FeeSchedulePageLocators.MARGIN_FEES_TABLE_LINK_X);
		return this;
	}
	
	public FeeSchedulePage verifyAgainstMarginFeesTable(String currency, String currency2, 
			String currency3, String currency4, 
			String currency5, String currency6, String currency7, String currency8) {
		
		Validation validate = new Validation(driver);
		validate.verifyTableData(FeeSchedulePageLocators.MARGIN_FEES_TABLE_BASE_CURRENCY_X,
				validate.getAssertionList(currency, currency2, currency3, currency4, currency5, 
						currency6, currency7, currency8));
		return this;
	}

}
