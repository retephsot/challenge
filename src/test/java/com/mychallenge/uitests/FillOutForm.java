package com.mychallenge.uitests;

import org.testng.annotations.Test;

import com.mychallenge.testbase.TestBase;

public class FillOutForm extends TestBase {
	
	/**
	 * Test to verify that test can select item from drop down, input text into textbox, click button and click page link.
	 * @param requestForm
	 * @param email
	 * @param categoryOption
	 * @param subject
	 * @param moreDetail
	 * @param notification
	 * @throws InterruptedException
	 */
	@Test(dataProvider = "dataProvider", description = "Test to validate that user can navigate to submit a request page"
			+ "and fill out general form and submit")
	public void fillOutGeneralForm(String requestForm, String email, String categoryOption, 
			String subject, String moreDetail, String notification) throws InterruptedException {
		
		landingpage.openSupportPage()
				   .navigateToSubmitRequestPage()
				   .openRequestForm(requestForm)
				   .fillOutForm(email, categoryOption, subject, moreDetail)
				   .submitRequestForm()
				   .verifyRequestSuccessfullySubmitted(notification);
	}

}
