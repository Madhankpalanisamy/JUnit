package com.adactinhotel.login;

import java.util.Date;

import org.adactin.hotel.LoginPage;
import org.adactin.hotel.UtilityClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinLoginPage {
	
	 static WebDriver driver;
	 public static UtilityClass global;

	@BeforeClass
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhan Kumar\\eclipse-workspace\\POM\\src\\test\\resources\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/index.php");
		
	}
	
	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
			
	}
	
	
	@Test
	public void login() {
		 
			LoginPage login = new LoginPage();
			WebElement txtUserName = login.getTxtUserName();
			global.type(txtUserName, "MadhanKumar");

			WebElement txtUserPassword = login.getTxtUserPassword();
			global.type(txtUserPassword, "Maddy#2020");

			WebElement btnLogin = login.getBtnLogin();
			global.btnClick(btnLogin);

		}
	
	
	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
			
	}
	
	@AfterClass
	public static void quitBrowser() {
		driver.quit();
	}
	
	
	

	

}
