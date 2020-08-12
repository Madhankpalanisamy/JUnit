package com.adactinhotel.login;

import java.util.Date;

import org.adactin.hotel.BookHotel;
import org.adactin.hotel.UtilityClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class BookingHotel {
	
	
public static UtilityClass global;
	
	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
			
	}
	
	
	@Test
	public void bookHotelPage() throws InterruptedException {
		// Book Hotel Page
		BookHotel book = new BookHotel();
		WebElement firstName = book.getFirstName();
		global.type(firstName, "Madhan Kumar");

		WebElement lastName = book.getLastName();
		global.type(lastName, "Palanisamy");

		WebElement billingAddress = book.getBillingAddress();
		global.type(billingAddress, "40/19 Thadikkarasway Kovil Street" + "\n" + "Alandur" + "\n" + "Chennai");

		WebElement creditcardNo = book.getCreditcardNo();
		global.type(creditcardNo, "7896541236214454");

		WebElement creditCardType = book.getCreditCardType();
		global.selectByVisibleText(creditCardType, "Master Card");

		WebElement expiryMonth = book.getExpiryMonth();
		global.selectByValue(expiryMonth, "2");

		WebElement expiryYear = book.getExpiryYear();
		global.selectByIndex(expiryYear, 12);

		WebElement getcVVNumber = book.getcVVNumber();
		global.type(getcVVNumber, "746");

		WebElement btnBookNow = book.getBtnBookNow();
		global.btnClick(btnBookNow);
		Thread.sleep(8000);			
	}
	
	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
			
	}

}
