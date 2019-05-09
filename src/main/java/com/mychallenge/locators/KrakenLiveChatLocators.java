package com.mychallenge.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mychallenge.pagebase.PageBase;

public class KrakenLiveChatLocators extends PageBase {
	
	public KrakenLiveChatLocators(WebDriver driver) {
		super(driver);
	}
	
	public static final By CHAT_WITH_US_INPUT_FIELD = By.cssSelector("input.desktop.ltr.input");
	
	/*
	 * to validate chat is functioning as expected
	 */
	public By getInputChatMessage(String chatMessage) {	
		return By.xpath("//div[text()='" + chatMessage +"']");
	}

}
