package com.mychallenge.pagebase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class PageBase {
	
	protected WebDriver driver;
	protected static Logger LOGGER = null;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		System.setProperty("log4j.configurationFile","log4j2Config.xml");
        LOGGER = LogManager.getLogger();
	}
	
	

}
