package com.stepdefinition;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author Lenovo
 * @Description Used to verify Adactin Hotel User Welcome Message
 * @Date 15/08/2022
 */
public class CommonSteps extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @param expLoginWelcomMsg
	 */
	@Then("User should verify welcome message {string} after login")
	public void user_should_verify_welcome_message_after_login(String expLoginWelcomMsg) {

		String actLoginWelcomeMsg = getAttributeValue(pom.getSearchHotelPage().getLoginWelComeMsg(), "value");

		Assert.assertEquals("Verify the user Welcome Message", expLoginWelcomMsg, actLoginWelcomeMsg);
	}

}
