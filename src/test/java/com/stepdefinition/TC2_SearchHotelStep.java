package com.stepdefinition;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author Lenovo
 * @Description Used to Adactin SearchHotel page
 * @Date 14/08/2022
 */
public class TC2_SearchHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @param used
	 *            to search the hotel valid and invalid credential
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @param childrensPerRoom
	 * @throws InterruptedException
	 */
	@Then("User should perform searching the hotel {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_perform_searching_the_hotel_and(String location, String hotels, String roomType,
			String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrensPerRoom)
			throws InterruptedException {
		pom.getSearchHotelPage().allFields(location, hotels, roomType, noOfRooms, checkInDate, checkOutDate,
				adultsPerRoom, childrensPerRoom);

	}

	/**
	 * @used
	 * @param expSelectHotelTitle
	 */

	@Then("User should verify the select hotel title {string} after searching the hotel")
	public void user_should_verify_the_select_hotel_title_after_searching_the_hotel(String expSelectHotelTitle) {
		String actSelectHotelTitle = getText(pom.getSelectHotelPage().getSelectTitle());
		Assert.assertEquals("Verify the SelectHotel Title", expSelectHotelTitle, actSelectHotelTitle);
	}

	/**
	 * 
	 * @param location
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @throws InterruptedException
	 */
	@Then("User should perform mandatory fields by searching the hotel {string},{string},{string},{string}and{string}")
	public void user_should_perform_mandatory_fields_by_searching_the_hotel_and(String location, String noOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom) throws InterruptedException {
		pom.getSearchHotelPage().mandatoryFields(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);
	}

	/**
	 * 
	 * @param expCheckInDateErrorMsg
	 * @param expCheckOutDateErrorMsg
	 */

	@Then("User should verify date error message {string} and {string} in the search hotel page")
	public void user_should_verify_date_error_message_and_in_the_search_hotel_page(String expCheckInDateErrorMsg,
			String expCheckOutDateErrorMsg) {
		String actCheckInDateErrorMsg = getText(pom.getSearchHotelPage().getCheckInErrorMsg());
		Assert.assertEquals("Verifying the CheckInDate ErrorMsg ", expCheckInDateErrorMsg, actCheckInDateErrorMsg);

		String actCheckOutDateErrorMsg = getText(pom.getSearchHotelPage().getCheckOutErrorMsg());
		Assert.assertEquals("Verifying the CheckOutDate ErrorMsg ", expCheckOutDateErrorMsg, actCheckOutDateErrorMsg);
	}

	/**
	 * 
	 */

	@Then("User should perform searching the hotel without entering any fields on the search hotel page")
	public void user_should_perform_searching_the_hotel_without_entering_any_fields_on_the_search_hotel_page() {
		click(pom.getSearchHotelPage().getBtnSubmit());
	}

	/**
	 * 
	 * @param expLocationErrorMsg
	 */
	@Then("User should verify location error message {string} in the search hotel page")
	public void user_should_verify_location_error_message_in_the_search_hotel_page(String expLocationErrorMsg) {
		String actLocationErrorMsg = getText(pom.getSearchHotelPage().getLocationErrorMsg());
		Assert.assertEquals("Verifying the SelectHotel Title", expLocationErrorMsg, actLocationErrorMsg);
	}

}
