package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author Lenovo
 * @Description Used to perform Adactin BookHotel page
 * @Date 14/08/2022
 *
 */
public class TC4_BookHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param dataTable
	 * @throws InterruptedException
	 */
	@Then("User should perform to booking the hotel by{string},{string}and{string}")
	public void user_should_perform_to_booking_the_hotel_by_and(String firstName, String lastName, String address,
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<Map<String, String>> list = dataTable.asMaps();
		Map<String, String> map = list.get(0);
		String ccNum = map.get("cardNo");
		String ccType = map.get("cardType");
		String expMonth = map.get("expMonth");
		String expYear = map.get("expYear");
		String cvvNum = map.get("cvvNum");
		sleep(2000);

		pom.getBookHotelPage().withAllFields(firstName, lastName, address, ccNum, ccType, expMonth, expYear, cvvNum);
	}

	/**
	 * 
	 * @param expBookingConformationTittle
	 */
	@Then("User should verify the booking conformation message {string} in booking conformation page")
	public void user_should_verify_the_booking_conformation_message_in_booking_conformation_page(
			String expBookingConformationTittle) {
		String actBookingConformationTittle = getText(pom.getBookingConfirmationPage().getBookingConformationTitle());
		Assert.assertEquals("Verify the BookingConformation Tittle", expBookingConformationTittle,
				actBookingConformationTittle);
	}

	/**
	 * 
	 */
	@Then("User should perform to booking the hotel without enter any fields")
	public void user_should_perform_to_booking_the_hotel_without_enter_any_fields() {
		click(pom.getBookHotelPage().getBtnBookNow());
	}

	/**
	 * 
	 * @param expFirstNameErrorMsg
	 * @param expLastNameErrorMsg
	 * @param expAddressErrorMsg
	 * @param expCCNumErrorMsg
	 * @param expCCTypeErrormsg
	 * @param expMonthErrorMsg
	 * @param expCVVNumErrorMsg
	 */
	@Then("User should verify the all error message {string},{string},{string},{string},{string},{string}and{string} in book a hotel page")
	public void user_should_verify_the_all_error_message_and_in_book_a_hotel_page(String expFirstNameErrorMsg,
			String expLastNameErrorMsg, String expAddressErrorMsg, String expCCNumErrorMsg, String expCCTypeErrormsg,
			String expMonthErrorMsg, String expCVVNumErrorMsg) {

		String actFirstNameErrorMsg = getText(pom.getBookHotelPage().getFirstNameErrorMsg());
		Assert.assertEquals("Verify FirstName Error Message", expFirstNameErrorMsg, actFirstNameErrorMsg);

		String actLastNameErrorMsg = getText(pom.getBookHotelPage().getLastNameErrorMsg());
		Assert.assertEquals("Verify LastName Error Msg", expLastNameErrorMsg, actLastNameErrorMsg);

		String actAddressErrorMsg = getText(pom.getBookHotelPage().getAddressErrorMsg());
		Assert.assertEquals("Verify Address Error Msg", expAddressErrorMsg, actAddressErrorMsg);

		String actCCNumErrorMsg = getText(pom.getBookHotelPage().getCCNumErrorMsg());
		Assert.assertEquals("Verify Address Error Msg", expCCNumErrorMsg, actCCNumErrorMsg);

		String actCCTypeErrorMsg = getText(pom.getBookHotelPage().getCCTypeErroMsg());
		Assert.assertEquals("Verify CCType Error Msg", expCCTypeErrormsg, actCCTypeErrorMsg);

		String actMonthErrorMsg = getText(pom.getBookHotelPage().getExpMonthErrorMsg());
		Assert.assertEquals("Verify ExpairyDate Error Msg", expMonthErrorMsg, actMonthErrorMsg);

		String actCCNumErrorMssg = getText(pom.getBookHotelPage().getCVVNumErroMsg());
		Assert.assertEquals("Verify Address Error Msg", expCVVNumErrorMsg, actCCNumErrorMssg);

	}

}
