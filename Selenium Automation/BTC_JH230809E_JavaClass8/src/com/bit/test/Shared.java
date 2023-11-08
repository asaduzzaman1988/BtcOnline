package com.bit.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shared {
	/*
	 * we will create individual method for each selenium action and they should be dynamic
	 */
	
	ChromeDriver dr;
	String pr;
	
	public Shared(ChromeDriver dr) {
		this.dr = dr;
	}

	public void clickOnAnyElement(By locator) {

		dr.findElement(locator).click();
	}
	
	public void goToAnyWebsite(String url) {
		//dr.get("http://www.target.com");
		dr.get(url);
	}
	
	public void verifyTitle(String expectedTitle) {

		//soft vs hard validation
		//what is the difference between assert and verify
		String actualTitle = dr.getTitle();
		boolean result = actualTitle.equals(expectedTitle);
		System.out.println("Title matched ? = " + result);
	/*	
		Assert.assertTrue(actualTitle.equals(expectedTitle));
		Assert.assertTrue(result);
		Assert.assertFalse(actualTitle.equals(expectedTitle));
		boolean ww = actualTitle == expectedTitle;
	*/
	}
	
	public void verifyText(By locator) {
		String text = dr.findElement(locator).getText();
		System.out.println(text);
	}
	
	public void typeOnAnyElement(By locator, String textValue) {
		dr.findElement(locator).sendKeys(textValue);
	}
	
	public boolean verifyElementDisplay(By by) {
		
		boolean result = dr.findElement(by).isDisplayed();
		System.out.println("Element displayed result = " + result);
		
		return result;
	}
	
	public void selectDropDownByIndex(By by, int index) {
		Select e = new Select(dr.findElement(by));
		e.selectByIndex(index);
	}
	
	public void selectDropDownByValue(By by, String value) {
		new Select(dr.findElement(by)).selectByValue(value);
	}
	
	public void selectDropDownByVisibleText(By by, String text) {
		Select b = new Select(dr.findElement(by));
		b.selectByVisibleText(text);
	}
	
	
	
	
	

}
