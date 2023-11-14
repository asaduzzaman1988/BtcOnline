package com.bit.nonAccessModifier;

import org.junit.Test;

public class Modifier_6 {
	
	//constant variable 
	static final int k = 100;
	//class variable
	static int ww = 111;
	//instance variable 
	int we = 1222;
	
	
	
	@Test
	public void test10() {
		

		Modifier_5 m3 = new Modifier_5(500, 1000);
		Modifier_5 m = new Modifier_5();
		Modifier_5 m2 = new Modifier_5(100, 200);
		Modifier_5 m4 = new Modifier_5();
		
		System.out.println(m2.a);//100
		
		System.out.println(m2.d);//200
		
		System.out.println(m3.a);//100
		
		System.out.println(m3.d);//1000
		
		System.out.println(m.a);//100
		
		System.out.println(m.d);//40
		
		System.out.println(m4.a);//500 or 100
		
		System.out.println(m4.d);//40 or 200
		
	}

}
