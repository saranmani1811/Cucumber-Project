package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

/**
 * 
 * @author Lenovo
 * @Description Used to maintain the LoginPage WebElements
 * @Date 15/08/2022
 */
public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPassWord;

	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class='auth_error']")
	private WebElement invalidLoginErrorMsg;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getInvalidLoginErrorMsg() {
		return invalidLoginErrorMsg;
	}

	// Scenario1-->valid data
	// Scenario3-->Invalid data
	
	/**
	 * @param userName
	 * @param password
	 * @throws InterruptedException
	 */
	public void login(String userName, String password) throws InterruptedException {
		type(getTxtUserName(), userName);

		type(getTxtPassWord(), password);

		click(getBtnLogin());

		// String invalidLoginErrorMsg = getText(getInvalidLoginErrorMsg());
	}

	
	
	
	// Scenario2-->ENTER key
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @throws AWTException
	 */
	public void loginWithEnter(String userName, String password) throws AWTException {
		type(getTxtUserName(), userName);

		type(getTxtPassWord(), password);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
