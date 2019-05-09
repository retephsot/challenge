package com.mychallenge.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mychallenge.pagebase.PageBase;

public class CommonLocators extends PageBase {
	
	public CommonLocators(WebDriver driver) {
		super(driver);
	}
	
	public static final By CHAT_WITH_US_X = By.xpath("//div[text()='Chat with us']");
	
	public static final By CHAT_WITH_US_INPUT_FIELD_CSS = By.cssSelector("input.desktop.ltr.input");
	
	public static final By CHAT_WITH_US_INPUT_FIELD_X = By.xpath("//input[contains(@class,'desktop ltr input')]");
	
	public By getInputChatMessage(String chatMessage) {
		
		return By.xpath("//div[text()='" + chatMessage +"']");
	}

}
