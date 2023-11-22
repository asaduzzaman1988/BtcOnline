package com.bit.testClasesses;

import org.junit.Test;

public class SmokeTest extends BaseTest{
/*run a single method from a class:
 mvn test -Dtest=SmokeTest#targetHeaderValidation
 run a single class: all the methods under that class will be executed
 mvn test -Dtest=SmokeTest
 
 
 	
 */
	//mvn test -Dtest=SmokeTest#targetHeaderValidation

	
	@Test
	public void targetHeaderValidation() {
		
		dr.get("https://www.selenium.dev/");
		String s = dr.getTitle();
		System.out.println("------------------------");
		System.out.println("Title of the page : " + s);
		
		
		System.out.println("------------------------");
	}
	
	
	@Test
	public void target() {
		System.out.println("2nd test..................");
		
		dr.get("https://www.selenium.dev/");
		String s = dr.getTitle();
		System.out.println("------------------------");
		System.out.println("Title of the page : " + s);
		
		
		System.out.println("------------------------");
	}

}
