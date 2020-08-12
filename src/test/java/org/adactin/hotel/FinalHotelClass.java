package org.adactin.hotel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalHotelClass {
	//WebDriver driver;
	public static UtilityClass global;
	
	
	@BeforeClass
	public static void driverLaunch() {
		global = new UtilityClass();
		global.getDriver(); // Return webDriver
		global.loadurl("http://adactinhotelapp.com/index.php");
	}

	@Test
	public void loginPage() throws InterruptedException {
		// Login Page

		LoginPage login = new LoginPage();
		WebElement txtUserName = login.getTxtUserName();
		global.type(txtUserName, "MadhanKumar");

		WebElement txtUserPassword = login.getTxtUserPassword();
		global.type(txtUserPassword, "Maddy#2020");

		WebElement btnLogin = login.getBtnLogin();
		global.btnClick(btnLogin);

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
