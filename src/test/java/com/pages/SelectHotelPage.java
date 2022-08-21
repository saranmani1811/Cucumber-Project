package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

/**
 * 
 * @author Lenovo
 * @Description Used to maintain the Adactin SelectHotel page webelements
 * @Date 15/08/2022
 */
public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "login_title")
	private WebElement selectTitle;

	@FindBy(id = "radiobutton_0")
	private WebElement btnRadio;

	@FindBy(id = "continue")
	private WebElement btnContinue;

	@FindBy(xpath = "//label[text()='Please Select a Hotel']")
	private WebElement selectHotelErrorMsg;

	public WebElement getSelectTitle() {
		return selectTitle;
	}

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getSelectHotelErrorMsg() {
		return selectHotelErrorMsg;
	}

	// Scenario1--> By Selecting Hotel
	
	/**
	 * 
	 */
	public void withSelect() {

		click(getBtnRadio());
		click(getBtnContinue());

	}

	// Scenario2-->Without Selecting Hotel
	
	/**
	 * 
	 */
	public void withoutSelect() {

		click(getBtnContinue());

	//	String selectHotelErrorMsg = getText(getSelectHotelErrorMsg());

	}

}
