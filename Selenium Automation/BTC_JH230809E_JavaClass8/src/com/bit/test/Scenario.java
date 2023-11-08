package com.bit.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {
	
	ChromeDriver dr;
	
	public Scenario(ChromeDriver dr) {
		this.dr = dr;
	}
	
	/*
	OPEN CHROME BROWSER 
	navigate to target.com 
	verify home page title 
	click on the sign in button 
	click on create account text link 
	Verify that "Create your Target account" is displayed in the header
	enter email as "abcd123455@yahoo.com"
	enter first name as "Bittech"
	enter last name as "USA"
	enter mobile no as "000000000"
	enter password as "QueensCity123@#$"
	click on create your account button 
	verify that "Please enter a valid mobile number" error message is displayed
		
	 */
	public void targetSignUp() throws InterruptedException {
		
		Shared shared = new Shared(dr);
		shared.goToAnyWebsite(SharedData.targetURL);
		shared.verifyTitle(SharedData.homePageTitle);
		shared.clickOnAnyElement(By.cssSelector("#headerPrimary>a:nth-child(10)"));
		Thread.sleep(3000);
		shared.clickOnAnyElement(By.xpath("//li[@id='listaccountNav-createAccount']/a"));
		Thread.sleep(3000);
		boolean r = shared.verifyElementDisplay(By.xpath("//h1[text()='Create your Target account']"));
		Assert.assertTrue(r);
		Assert.assertTrue(shared.verifyElementDisplay(By.xpath("//h1[text()='Create your Target account']")));
		shared.typeOnAnyElement(By.id("username"), "gasdfhjgsdefuh23@gmail.com");
		shared.typeOnAnyElement(By.name("firstnamecreateaccount"), "Bittech");
		shared.typeOnAnyElement(By.id("lastname"), "Consulting");
		shared.typeOnAnyElement(By.id("phone"), "0000000000");
		shared.typeOnAnyElement(By.id("password"), "HGFDRTGF%^$#^$#^$%^");
		shared.clickOnAnyElement(By.xpath("//button[@id='createAccount']"));
		Thread.sleep(3000);
		shared.verifyElementDisplay(By.xpath("//div[contains(text(),'mobile number')]"));
		

	}


	public void macysPurchase() throws InterruptedException {
		Shared shared = new Shared(dr);
		

		shared.clickOnAnyElement(By.id(""));
		
	}
}
