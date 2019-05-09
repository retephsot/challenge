package com.mychallenge.uitests;

import org.testng.annotations.Test;

import com.mychallenge.testbase.TestBase;

public class SelectItemFromPullDownMenu extends TestBase {
	
	/**
	 * Selecting Funding Options page link from Features drop down menu
	 * @param menuSelection
	 */
	@Test(dataProvider = "dataProvider", description = "Test to validate user can navigate to Funding Options page by selecting page link from Features menu")
	public void selectFundingOptionsLinkFromFeaturesMenu(String menuSelection) {
		
		landingpage.openFeaturesMenu()
				   .navigateToFundingOptionsPage()
				   .verifyNaviationSuccessful(menuSelection)
				   .verifyPageTitle(menuSelection);
		
	}

}
