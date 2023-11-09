package com.bit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	/*in BaseTest we usually keep all the common steps that applies to all of the test
	 * before and after annotation gets executed against each test thats why we will inherit this class 
	 * in SmokeTest. as Junit annotation ONLy works if they are in the same class. 
	 * 
	 * Added new Code
	 */
	
	ChromeDriver dr;

	@Before
	public void openBrowser() {
		// WebDriver d = new ChromeDriver();
		// WebDriver d1 = new FirefoxDriver();
		// WebDriver d2 = new InternetExplorerDriver();

		dr = new ChromeDriver();
		dr.manage().window().setSize(new Dimension(1600, 800));
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		dr.quit();
	}
	
	

/*
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	//before and after will get executed against each test
	@Before
	public void test3() {
		System.out.println("test3");
	}
	
	@After
	public void test4() {
		System.out.println("test4");
	}
	
	@BeforeClass
	public static void test5() {
		System.out.println("test5");
	}
	
	@AfterClass
	public static void test6() {
		System.out.println("test6");
	}
	@Test
	public void test7() {
		System.out.println("test7");
	}
*/
}
