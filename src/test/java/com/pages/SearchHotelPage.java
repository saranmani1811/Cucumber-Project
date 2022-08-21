package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

/**
 * 
 * @author Lenovo
 * @Descroption Used to maintain the Adactin SelectHotel page webelements
 * @Date 15/08/2022
 */
public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username_show")
	private WebElement loginWelComeMsg;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement noOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;

	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement childernPerRoom;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	@FindBy(id = "checkin_span")
	private WebElement checkInErrorMsg;

	@FindBy(id = "checkout_span")
	private WebElement checkOutErrorMsg;

	@FindBy(id = "location_span")
	private WebElement locationErrorMsg;

	public WebElement getLoginWelComeMsg() {
		return loginWelComeMsg;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildernPerRoom() {
		return childernPerRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getCheckInErrorMsg() {
		return checkInErrorMsg;
	}

	public WebElement getCheckOutErrorMsg() {
		return checkOutErrorMsg;
	}

	public WebElement getLocationErrorMsg() {
		return locationErrorMsg;
	}

	// Scenario1-->Enters All Fields
	// Scenario3-->Invalid DateCheckIn and DateCheckOut

	/**
	 * 
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @param childernsPerRoom
	 * @throws InterruptedException
	 */
	public void allFields(String location, String hotels, String roomType, String noOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childernsPerRoom) throws InterruptedException {
		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getHotel(), hotels);
		selectByVisibleText(getRoomType(), roomType);
		selectByVisibleText(getNoOfRooms(), noOfRooms);
		clear(getCheckInDate());
		type(getCheckInDate(), checkInDate);
		clear(getCheckOutDate());
		type(getCheckOutDate(), checkOutDate);
		selectByVisibleText(getAdultsPerRoom(), adultsPerRoom);
		selectByVisibleText(getChildernPerRoom(), childernsPerRoom);

		click(getBtnSubmit());

	}

	// Scenario2-->Only Mandatory Fields

	/**
	 * 
	 * @param location
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @throws InterruptedException
	 */
	public void mandatoryFields(String location, String noOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom) throws InterruptedException {
		sleep(4000);
		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getNoOfRooms(), noOfRooms);
		type(getCheckInDate(), checkInDate);
		type(getCheckOutDate(), checkOutDate);
		selectByVisibleText(getAdultsPerRoom(), adultsPerRoom);
		click(getBtnSubmit());

	}

}
