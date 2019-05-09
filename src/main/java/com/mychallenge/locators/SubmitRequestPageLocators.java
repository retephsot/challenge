package com.mychallenge.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mychallenge.pagebase.PageBase;

public class SubmitRequestPageLocators extends PageBase {
	
	public SubmitRequestPageLocators(WebDriver driver) {
		super(driver);
	}
	
	public static final By SUBMIT_A_REQUEST_MENU_INPUT_X = By.xpath("//a[@class='nesty-input']");
	
	public static final By EMAIL_FIELD_CSS = By.cssSelector("input#request_anonymous_requester_email");
	
	public static final By SUBMIT_A_REQUEST_CATEGORY_MENU_INPUT_X = By.xpath("//label[text()='Category']/parent::*//a[@class='nesty-input']");
	
	public static final By SUBMIT_A_REQUEST_SUBJECT_FIELD_CSS = By.cssSelector("#request_subject");
	
	public static final By SUBMIT_A_REQUEST_DESCRIPTION_TEXTAREA_CSS = By.cssSelector("#request_description");
	
	public static final By REQUEST_FORM_SUBMIT_BUTTON_X = By.xpath("//input[@value='Submit']");
	
	
	public By getSubmitRequestByLocatorX(String requestOption) {
		return By.xpath("//li[contains(text(),'" + requestOption + "')]");
	}
	
	public By getRequestFormCategoryByLocatorX(String categoryOption) {
		return By.xpath("//ul[@role='listbox']//li[text()='"+ categoryOption + "']");
	}

}
