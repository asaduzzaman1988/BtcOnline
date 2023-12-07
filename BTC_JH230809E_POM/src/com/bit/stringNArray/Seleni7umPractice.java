package com.bit.stringNArray;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Seleni7umPractice {
	
	public void test1(WebDriver dr) throws InterruptedException {
		
		dr.get("https://www.target.com/");
		List<WebElement> ele = dr.findElements(By.xpath("//div[contains(@class,'fHQQqb')]/a"));
		
		int count = ele.size();
		System.out.println(count);
		
		for(int i=1; i<count; i++) {
			Thread.sleep(3000);
			dr.findElement(By.xpath("//div[contains(@class,'fHQQqb')]/a["+i+"]")).click();
			Thread.sleep(2000);
			String s = dr.getTitle();
			System.out.println(s);
			dr.navigate().back();
		}
		
		
	}
	
	

}
