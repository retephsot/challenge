package com.mychallenge.helper;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mychallenge.pagebase.PageBase;

public class WindowsHandler extends PageBase {
	
	public WindowsHandler(WebDriver driver) {
		super(driver);
	}
	
	public void switchToNewWindow() throws InterruptedException {
		
		Iterator<String> wh = driver.getWindowHandles().iterator();		
		String mainWinow = wh.next();
		String newWinow = wh.next();		
		driver.switchTo().window(newWinow);				
	}
	
	public void switchToMainWindow() throws InterruptedException {
		
		Iterator<String> wh = driver.getWindowHandles().iterator();		
		String mainWin = wh.next();
		driver.switchTo().window(mainWin);	
	}
	

}
