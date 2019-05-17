package com.mychallenge.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mychallenge.pagebase.PageBase;

public class Validation extends PageBase {
	
	public Validation(WebDriver driver) {
		super(driver);
	}
	
	public List<String> getAssertionList(String ... assertionStrings ) {
		List<String> expectedAssertList = new ArrayList<String>();
		for(String str : assertionStrings) {
			expectedAssertList.add(str);
		}
		return expectedAssertList;
	}
	
	public void verifyTableData(By locator, List<String> assertList) {
		
		int count = driver.findElements(locator).size();
		LOGGER.info("Verifying expected value displays");
		for(int i = 1; i<= count; ++i) {
			Assert.assertTrue(assertList.contains(driver.findElement(By.xpath("//div[@class='tab displayed']//tbody//tr["+i+"]/td[1]")).getText()), ""
					+ "Unexpected data is present --> Assertion Failed");
		}
	}

}
