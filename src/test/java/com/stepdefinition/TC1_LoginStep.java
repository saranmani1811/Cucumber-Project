package com.stepdefinition;

import java.awt.AWTException;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author Lenovo
 * @Description Used to login AdactinHotel with valid and invalid credentials
 * @Date 15/08/2022
 */
public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @param Used to launch the browser
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Given("User is on the login page")
	public void user_is_on_the_login_page() throws FileNotFoundException, IOException {

		// getDriverType(getPropertyValue("browser"));
		// loadUrl(getPropertyValue("url"));
		// maximize();

	}

	/**
	 * @param Used
	 *            to login
	 * @param userName
	 * @param passWord
	 * @throws InterruptedException
	 */
	@When("User should perform login{string}and{string}")
	public void user_should_perform_login_and(String userName, String passWord) throws InterruptedException {
		pom.getLoginPage().login(userName, passWord);

	}

	/**
	 * @param Used
	 *            to login with ENTER key
	 * @param userName
	 * @param password
	 * @throws AWTException
	 */

	@When("User should perform login {string}and{string} using ENTER key")
	public void user_should_perform_login_and_using_ENTER_key(String userName, String password) throws AWTException {
		pom.getLoginPage().loginWithEnter(userName, password);
	}

	/**
	 * @param Used
	 *            to verify invalid login error message
	 * @param expLoginInvalidErrorMsg
	 */
	@Then("User should verify  invalid data error message  {string} after login")
	public void user_should_verify_invalid_data_error_message_after_login(String expLoginInvalidErrorMsg) {

		String actLoginInvalidErrorMsg = getText(pom.getLoginPage().getInvalidLoginErrorMsg());

		Assert.assertEquals("Verifying the Login Invalid Error Message", expLoginInvalidErrorMsg,
				actLoginInvalidErrorMsg);

	}
}