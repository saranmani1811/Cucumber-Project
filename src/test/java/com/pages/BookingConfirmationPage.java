package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

/**
 * 
 * @author Lenovo
 * @Description Used to maintain the Adactin BookingConformation Webelements
 * @Date 15/08/2022
 */
public class BookingConfirmationPage extends BaseClass {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement txtBookingCOnformation;

	@FindBy(id = "order_no")
	private WebElement orderId;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookedItinerary;

	public WebElement getBookingConformationTitle() {
		return txtBookingCOnformation;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	/**
	 * 
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public String bookingConfirm() throws InterruptedException, IOException {

		String orderId = getAttributeValue(getOrderId(), "value");

		sleep(2000);
		click(getBookedItinerary());

		return orderId;

	}

}
