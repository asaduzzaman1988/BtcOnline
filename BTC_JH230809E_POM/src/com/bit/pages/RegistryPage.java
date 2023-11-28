package com.bit.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.bit.data.PageData;

public class RegistryPage extends LoadableComponent<RegistryPage>{
	//except home page we should use LoadableCompo0nent in all other page

	WebDriver dr;
	public RegistryPage(WebDriver dr) {
		this.dr = dr;
	}
	
	@Override
	protected void isLoaded() throws Error {
		//we perform major validation in Isload. Mostly using assertion
		System.out.println("IsLoad executed");
		Assert.assertTrue(dr.findElement(By.xpath("//h1[text()='Registry']")).isDisplayed());
	}

	@Override
	protected void load() {
		System.out.println("IsLoad Failed.................");
		dr.get("https://www.target.com/gift-registry");
	}
	
	public void verifyRegistryPageTitle() {
		String actualTitle = dr.getTitle();
		
		if(actualTitle.equals(PageData.registryTitle)) {
			System.out.println("registry title matched");
		}else {
			System.out.println("registry title did not match...........");
		}
	}

	public void verifyUrl() {
		
		String actualUrl = dr.getCurrentUrl();
		
		if(actualUrl.contains(PageData.registryUrl)) {
			System.out.println("registry URL matched");
		}else {
			System.out.println("registry URL did not match : " + actualUrl);
		}
	}

	public HomePage clickOnLogo() {
		dr.findElement(By.xpath("//nav/a[1]")).click();
		return new HomePage(dr);
	}
	
	
}
