package com.mychallenge.pages;

import org.openqa.selenium.WebDriver;

import com.mychallenge.helper.Waits;
import com.mychallenge.helper.WindowsHandler;
import com.mychallenge.locators.CommonLocators;
import com.mychallenge.locators.FeaturesDropDownMenuLocators;
import com.mychallenge.locators.LandingPageLocators;
import com.mychallenge.pagebase.PageBase;
import com.mychallenge.util.SeleniumMethods;

public class LandingPage extends PageBase {
	
	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	int maxWait = 8;
	
	
	
	public FeaturesDropDownMenu openFeaturesMenu() {
		SeleniumMethods sel = new SeleniumMethods(driver);
		Waits wait = new Waits(driver);
		LOGGER.info("Hovering over Features link");
		sel.actionsMoveToElementBy(LandingPageLocators.FEATURES_LINK_X);		
		return new FeaturesDropDownMenu(driver);		
	}
	
	public KrakenLiveChat clickOnLiveChat() {
		SeleniumMethods sel = new SeleniumMethods(driver);
		sel.actionsMoveToElementBy(CommonLocators.CHAT_WITH_US_X);
		sel.jsClick(CommonLocators.CHAT_WITH_US_X);
		return new KrakenLiveChat(driver);
	}
	
	public SupportPage openSupportPage() throws InterruptedException {
		SeleniumMethods sel = new SeleniumMethods(driver);
		WindowsHandler wh = new WindowsHandler(driver);
		sel.selClickBy(LandingPageLocators.SUPPORT_LINK_X);
		LOGGER.info("switching to new window");
		wh.switchToNewWindow();
		return new SupportPage(driver);
	}

}
