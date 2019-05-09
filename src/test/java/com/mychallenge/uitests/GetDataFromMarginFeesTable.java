package com.mychallenge.uitests;

import org.testng.annotations.Test;

import com.mychallenge.testbase.TestBase;

public class GetDataFromMarginFeesTable extends TestBase {
	
	@Test(dataProvider = "dataProvider", description = "Test to validate that user can navigate to the Fee Schedule page, "
			+ "and retrieve data from the Margin Fees table")
	
	public void verifyMarginFeesTableBaseCurrency(String currency, String currency2, String currency3, String currency4, 
			String currency5, String currency6, String currency7, String currency8) {
		
		landingpage.openFeaturesMenu()
				   .navigateToFeeSchedulePage()
				   .scrollToMarginFeesDiv()
				   .openMarginFeesTable()
				   .verifyAgainstMarginFeesTable(currency, currency2, currency3, currency4, currency5, currency6, currency7, currency8);
		
		
	}

}
