package com.mychallenge.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mychallenge.pagebase.PageBase;

public class FeaturesDropDownMenuLocators extends PageBase {
	
	public FeaturesDropDownMenuLocators(WebDriver driver) {
		super(driver);
	}
	
	public static final By FUNDING_OPTIONS_LINK_X = By.xpath("//ul[@class='primary']//a[text()='Funding Options']");
	
	public static final By CRYTO_WATCH_LINK_X = By.xpath("//ul[@class='primary']//a[text()='Cryptowatch']");
	
	public static final By FEE_SCHEDULE_PAGE_LINK_X = By.xpath("//ul[@class='primary']//a[text()='Fee Structure']");
	
	/*
	 * wait for invisibility of below before selecting drop down menu option
	 */
	public static final By HIDDEN_SUBMENU_X = By.xpath("//ul[@class='hidden-submenu']");

}
