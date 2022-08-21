package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

/**
 * @Description Used to maintain the Adactin BookHotel page webelements
 * @author Lenovo
 * @Date 15/08/2022
 */
public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement bookHotelTitle;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cardNum;

	@FindBy(id = "cc_type")
	private WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private WebElement cardExpMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement cardExpYear;

	@FindBy(id = "cc_cvv")
	private WebElement cardCCVNum;

	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	@FindBy(id = "first_name_span")
	private WebElement firstNameErrorMsg;

	@FindBy(id = "last_name_span")
	private WebElement lastNameErrorMsg;

	@FindBy(id = "address_span")
	private WebElement addressErrorMsg;

	@FindBy(id = "cc_num_span")
	private WebElement ccNumErrorMsg;

	@FindBy(id = "cc_type_span")
	private WebElement ccTypeErroMsg;

	@FindBy(id = "cc_expiry_span")
	private WebElement expDateErrorMsg;

	@FindBy(id = "cc_cvv_span")
	private WebElement cvvNumErroMsg;

	public WebElement getBookHotelTitle() {
		return bookHotelTitle;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExpMonth() {
		return cardExpMonth;
	}

	public WebElement getCardExpYear() {
		return cardExpYear;
	}

	public WebElement getCardCCVNum() {
		return cardCCVNum;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getFirstNameErrorMsg() {
		return firstNameErrorMsg;
	}

	public WebElement getLastNameErrorMsg() {
		return lastNameErrorMsg;
	}

	public WebElement getAddressErrorMsg() {
		return addressErrorMsg;
	}

	public WebElement getCCNumErrorMsg() {
		return ccNumErrorMsg;
	}

	public WebElement getCCTypeErroMsg() {
		return ccTypeErroMsg;
	}

	public WebElement getExpMonthErrorMsg() {
		return expDateErrorMsg;
	}

	public WebElement getCVVNumErroMsg() {
		return cvvNumErroMsg;
	}

	// Scenario1-->Entering all fields
	
/**
 * 
 * @param firstName
 * @param lastName
 * @param address
 * @param cardNum
 * @param cardType
 * @param cardExpMonth
 * @param cardExpYear
 * @param cardCCVNum
 * @throws InterruptedException
 */
	public void withAllFields(String firstName, String lastName, String address, String cardNum, String cardType,
			String cardExpMonth, String cardExpYear, String cardCCVNum) throws InterruptedException {
		type(getFirstName(), firstName);
		type(getLastName(), lastName);
		type(getAddress(), address);
		type(getCardNum(), cardNum);
		selectByVisibleText(getCardType(), cardType);
		selectByVisibleText(getCardExpMonth(), cardExpMonth);
		selectByValue(getCardExpYear(), cardExpYear);
		type(getCardCCVNum(), cardCCVNum);
		click(getBtnBookNow());
		sleep(10000);
	}

}
