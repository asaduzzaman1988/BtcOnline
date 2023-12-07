package com.bit.test;

import org.junit.Test;

import com.bit.pages.HomePage;
import com.bit.pages.RegistryPage;
import com.bit.stringNArray.Seleni7umPractice;

public class SmokeTest extends BaseTest{
	
	@Test
	public void targetMenuValidation() throws InterruptedException {
		
		HomePage homePage = new HomePage(dr);
		homePage.verifyHomePageTitle();
		Thread.sleep(3000);
		homePage.verifyUrl();
		homePage.verifyHomePageLogo();
		RegistryPage registryPage = homePage.clickRegistryLink();
		registryPage.verifyRegistryPageTitle();
		registryPage.verifyUrl();
		HomePage homePage1 = registryPage.clickOnLogo();
		
		
	}
	
	@Test
	public void targetFooterValidation() throws InterruptedException {
		
		Seleni7umPractice s = new Seleni7umPractice();
		s.test1(dr);
		
	}

}
