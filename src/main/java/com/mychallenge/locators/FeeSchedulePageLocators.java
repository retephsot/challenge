package com.mychallenge.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mychallenge.pagebase.PageBase;

public class FeeSchedulePageLocators extends PageBase {
	
	public FeeSchedulePageLocators(WebDriver driver) {
		super(driver);
	}
	
	public static final By MARGIN_FEES_TABLE_BASE_CURRENCY_X = By.xpath("//div[@class='tab displayed']//tbody//tr");
	
	public static final By MARGIN_FEES_TABLE_LINK_X = By.xpath("//div[text()='Margin Fees']");

}
