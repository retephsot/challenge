package com.mychallenge.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mychallenge.pagebase.PageBase;

public class SupportPageLocators extends PageBase {
	
	public SupportPageLocators(WebDriver driver) {
		super(driver);
	}
	
	public static final By SEARCH_FIELD_X = By.xpath("//input[@id='query']");
	
	public static final By SUBMIT_A_REQUEST_LINK_TEXT = By.linkText("Submit a request");
	
	public static final By SUBMIT_A_REQUEST_LINK_X = By.xpath("//a[text()='Submit a request']");
	
	public static final By REQUEST_SUCCESSFULLY_SUBMITTED_NOTIFICATION_X = By.xpath("//span[@class='notification-text']");

}
