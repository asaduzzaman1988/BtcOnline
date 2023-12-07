package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	/*
	design pattern 
	page factory 
	loadAbleComponent
	
	each webPage should have a individual class
	each element of the page should be kept inside a method 
	any method that changes the page because of any action, we must return that page
	
	*/
	WebDriver dr; //first time driver got initiated

	@Before
	public void openBrowser() {
		// WebDriver d = new ChromeDriver();
		// WebDriver d1 = new FirefoxDriver();
		// WebDriver d2 = new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32_114\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().setSize(new Dimension(1600, 800));
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		dr.quit();
	}
	
	
	
	

}
