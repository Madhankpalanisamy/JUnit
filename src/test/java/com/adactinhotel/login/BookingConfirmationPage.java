package com.adactinhotel.login;

import java.util.Date;

import org.adactin.hotel.BookingConfirmation;
import org.adactin.hotel.UtilityClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class BookingConfirmationPage {
	
public static UtilityClass global;
	
	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
			
	}
	
	
	@Test
	public void bookConfirmationPage() throws InterruptedException {

		// Booking Confirmation
		BookingConfirmation conf = new BookingConfirmation();
		WebElement orderNo = conf.getOrderNo();
		global.getAttribute(orderNo);

		WebElement logOut = conf.getLogOut();
		global.clickContinueButton(logOut);
		Thread.sleep(1000);
	}
	
	@AfterClass
	public static void closeBrowser() {
		global.quitBrowser();
	}


}
