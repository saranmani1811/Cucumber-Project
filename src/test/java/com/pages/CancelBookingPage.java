package com.pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

/**
 * 
 * @author Lenovo
 * @Description Used to maintain the AdactinHotel CancelBooking Page WebElements
 * @Descriptin 15/08/2022
 */
public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_id_text")
	private WebElement searchOrderId;

	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement btnRadioSelect;

	@FindBy(xpath = "(//table//tr//td)[28]//input")
	private WebElement btnCancel;

	@FindBy(id = "search_result_error")
	private WebElement bookingHasBeenCancelledMsg;

	public WebElement getSearchOrderId() {
		return searchOrderId;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnRadioSelect() {
		return btnRadioSelect;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getbookingHasBeenCancelledMsg() {
		return bookingHasBeenCancelledMsg;
	}

	
	
	
	/**
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void generatedOrderId() throws IOException, InterruptedException {

		BookingConfirmationPage b = new BookingConfirmationPage();

		type(getSearchOrderId(), b.bookingConfirm());

		click(getBtnGo());

		click(getBtnRadioSelect());

		click(getBtnCancel());

		sleep(1000);
		accept();

		// String finalText = getText(getbookingHasBeenCancelledMsg());
	}

}
