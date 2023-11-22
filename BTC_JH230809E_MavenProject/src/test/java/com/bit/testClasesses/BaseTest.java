package com.bit.testClasesses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	//C:\Users\User\eclipse-workspace\BTC_JH230204M_MavenProject
	
	public WebDriver dr;
	
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads"
				+ "\\chromedriver_win32_111\\chromedriver.exe");
		//open blank chrome browser
		//dr = new ChromeDriver();
		
		//Open Firefox browser
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\User\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		dr = new FirefoxDriver();
		
		dr.manage().window().setSize(new Dimension(1700,1000));
	}

	@After
	public void closeBrowser() throws InterruptedException{
		Thread.sleep(5000);
		dr.quit();
	}

	
	
	
}



