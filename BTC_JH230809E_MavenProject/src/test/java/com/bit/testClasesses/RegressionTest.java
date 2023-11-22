package com.bit.testClasesses;

import org.junit.Test;

public class RegressionTest extends BaseTest{
	
	@Test
	public void targetHeaderValidation() {
		
		dr.get("https://www.target.com/");
		String s = dr.getTitle();
		System.out.println("------------------------");
		System.out.println("Title of the page : " + s);
		
		
		System.out.println("------------------------");
	}

}
