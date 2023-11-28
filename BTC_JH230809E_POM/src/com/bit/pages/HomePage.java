package com.bit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bit.data.PageData;

public class HomePage {
	
	WebDriver dr;
	public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	/*....... Page factory /Element repository........*/
	//old way, don't use it but remember
	@FindBy(how=How.CSS, using ="#headerPrimary>a:nth-child(1)") 
	WebElement  HomePageLog;
	
	@FindBy(css = "#headerPrimary>a:nth-child(10)") 
	WebElement SignInButton;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 jGuEwV']/li[1]/a")
	WebElement signInLink;
	
	@FindBy(xpath="//ul[@class='styles__ListUl-sc-diphzn-4 jGuEwV']/li[2]/a")
	WebElement createAccount;
	
	@FindBy(xpath = "//a[text()='Registry']")
	WebElement registryLink;
	
	/*....... End of Page factory ........*/
	
	
	public void verifyHomePageTitle() {
		String actualTitle = dr.getTitle();
		
		if(actualTitle.equals(PageData.homePageTitle)) {
			System.out.println("Home page title matched");
		}else {
			System.out.println("Home page title did not match...........");
		}
	}

	public void verifyUrl() {
		
		String actualUrl = dr.getCurrentUrl();
		
		if(actualUrl.contains(PageData.homePageUrl)) {
			System.out.println("Home page URL matched");
		}else {
			System.out.println("Home page URL did not match : " + actualUrl);
		}
	}
	
	public void verifyHomePageLogo() {
		boolean result = HomePageLog.isDisplayed();
		
		if(result) {
			System.out.println("Home page logo is displayed");
		}else {
			System.out.println("Home page logo validation failed : ");
		}
	}
	
	public void clickOnSignInButton() {
		SignInButton.click();
	}
	
	public SignInPage clickOnSignInLink() {
		signInLink.click();
		return new SignInPage();
	}
	
	public SignInPage createAccountLink() {
		createAccount.click();
		return new SignInPage();
	}
	
	public RegistryPage clickRegistryLink() {
		registryLink.click();
		return new RegistryPage(dr);
	}
	
}
