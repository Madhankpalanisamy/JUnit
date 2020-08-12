package com.adactinhotel.login;

import java.util.Date;

import org.adactin.hotel.SearchHotel;
import org.adactin.hotel.UtilityClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class SearchingHotel {
	
	public static UtilityClass global;
	
	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
			
	}
	
	@Test
	public void searchPage() {
		// Search Hotel Page
	SearchHotel srch = new SearchHotel();
	WebElement location = srch.getLocation();
	global.selectByVisibleText(location, "London");

	WebElement hotels = srch.getHotels();
	global.selectByValue(hotels, "Hotel Hervey");

	WebElement roomType = srch.getRoomType();
	global.selectByIndex(roomType, 4);

	WebElement btnSubmit = srch.getBtnSubmit();
	global.getSearchDetails(btnSubmit);
}
	
	
	
	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
			
	}
	

}
