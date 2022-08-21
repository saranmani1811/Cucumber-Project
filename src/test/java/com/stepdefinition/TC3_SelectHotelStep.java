package com.stepdefinition;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author Lenovo
 * @Description Used to perform Adactin SelectHotel page
 * @Date 14/08/22
 *
 */
public class TC3_SelectHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 */
	@Then("User should perform continue to selecting the hotel")
	public void user_should_perform_continue_to_selecting_the_hotel() {
		pom.getSelectHotelPage().withSelect();
	}

	/**
	 * 
	 * @param expBookHotelTittle
	 */
	@Then("User should verify the book hotel  title {string} in the book hotel page")
	public void user_should_verify_the_book_hotel_title_in_the_book_hotel_page(String expBookHotelTittle) {
		String actBookHotelTittle = getText(pom.getBookHotelPage().getBookHotelTitle());
		Assert.assertEquals("Verify the BookHotel Tittle", expBookHotelTittle, actBookHotelTittle);
	}

	/**
	 * 
	 */
	@Then("User should perform continue to without selecting hotel")
	public void user_should_perform_continue_to_without_selecting_hotel() {
		click(pom.getSelectHotelPage().getBtnContinue());
	}

	/**
	 * 
	 * @param expSelectHotelErrorMsg
	 */
	@Then("User shuold verify the select hotel error message {string} in Select Hotel page")
	public void user_shuold_verify_the_select_hotel_error_message_in_Select_Hotel_page(String expSelectHotelErrorMsg) {
		String actSelectHotelErrorMsg = getText(pom.getSelectHotelPage().getSelectHotelErrorMsg());
		Assert.assertEquals("Verify the SelectErrorMsg", expSelectHotelErrorMsg, actSelectHotelErrorMsg);
	}

}
