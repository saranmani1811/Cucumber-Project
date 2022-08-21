package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author Lenovo
 * @Description User to perform Adactin CancelBooking page
 * @Date 14/08/2022
 */
public class TC5_CancelBookingStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Then("User should perform cancelling the booking with order id")
	public void user_should_perform_cancelling_the_booking_with_order_id() throws IOException, InterruptedException {
		pom.getCancelBookingPage().generatedOrderId();
	}

	/**
	 * 
	 * @param expBookingCancelMsg
	 */
	@Then("User should verify the {string} message in Booked Itinerary page")
	public void user_should_verify_the_message_in_Booked_Itinerary_page(String expBookingCancelMsg) {
		String actBookingCancellMsg = getText(pom.getCancelBookingPage().getbookingHasBeenCancelledMsg());
		Assert.assertEquals("Verify the Booking Cancelled Msg", expBookingCancelMsg.trim(), actBookingCancellMsg);
	}

	/**
	 * 
	 * @param existingOrderId
	 * @throws InterruptedException
	 */
	@Then("User should cancel the existing order id {string}")
	public void user_should_cancel_the_existing_order_id(String existingOrderId) throws InterruptedException {
		click(pom.getBookingConfirmationPage().getBookedItinerary());
		sleep(1000);
		type(pom.getCancelBookingPage().getSearchOrderId(), existingOrderId);
		sleep(1000);
		click(pom.getCancelBookingPage().getBtnGo());
		sleep(1000);
		click(pom.getCancelBookingPage().getBtnRadioSelect());
		sleep(1000);
		click(pom.getCancelBookingPage().getBtnCancel());

		accept();
	}

}
