package com.mychallenge.pages;

import org.openqa.selenium.WebDriver;

import com.mychallenge.locators.SubmitRequestPageLocators;
import com.mychallenge.pagebase.PageBase;
import com.mychallenge.util.SeleniumMethods;

public class SubmitRequestPage extends PageBase {
	
	public SubmitRequestPage(WebDriver driver) {
		super(driver);
	}
	
	public SubmitRequestPage openRequestForm(String requestForm) {
		
		SeleniumMethods sel = new SeleniumMethods(driver);
		sel.selClickBy(SubmitRequestPageLocators.SUBMIT_A_REQUEST_MENU_INPUT_X);
		SubmitRequestPageLocators locator = new SubmitRequestPageLocators(driver);
		sel.selClickBy(locator.getSubmitRequestByLocatorX(requestForm));
		return this;
	}
	
	public SubmitRequestPage fillOutForm(String email, String categoryOption, String subject, String moreDetail) {
		
		SeleniumMethods sel = new SeleniumMethods(driver);
		sel.selSendKeysBy(SubmitRequestPageLocators.EMAIL_FIELD_CSS, email);
		sel.selClickBy(SubmitRequestPageLocators.SUBMIT_A_REQUEST_CATEGORY_MENU_INPUT_X);
		SubmitRequestPageLocators locator = new SubmitRequestPageLocators(driver);
		sel.selClickBy(locator.getRequestFormCategoryByLocatorX(categoryOption));
		sel.selSendKeysBy(SubmitRequestPageLocators.SUBMIT_A_REQUEST_SUBJECT_FIELD_CSS, subject);
		sel.selSendKeysBy(SubmitRequestPageLocators.SUBMIT_A_REQUEST_DESCRIPTION_TEXTAREA_CSS, moreDetail);		
		return this;
	}
	
	public SupportPage submitRequestForm() {
		
		SeleniumMethods sel = new SeleniumMethods(driver);
		sel.selClickBy(SubmitRequestPageLocators.REQUEST_FORM_SUBMIT_BUTTON_X);		
		return new SupportPage(driver);
	}
	

}
