package com.adactinhotel.login;

import java.util.Date;

import org.adactin.hotel.SelectHotel;
import org.adactin.hotel.UtilityClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class SelectingHotel {
public static UtilityClass global;
	
	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
			
	}
	
	@Test
	public void selecthotelPage() throws InterruptedException {
	/// SelectHotel Page
	SelectHotel clickingingHotel = new SelectHotel();
	WebElement hotelSelected = clickingingHotel.getClickRadioHotel();
	global.selectHotelDetails(hotelSelected);

	WebElement btnContinue = clickingingHotel.getBtnContinue();
	global.clickContinueButton(btnContinue);
	Thread.sleep(5000);
	}
	
	
	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
			
	}
	
	
}
