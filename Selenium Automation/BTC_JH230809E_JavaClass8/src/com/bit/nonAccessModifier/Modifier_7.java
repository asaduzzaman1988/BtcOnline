package com.bit.nonAccessModifier;

public final class Modifier_7 {
	
	/*
	 * we must create N object of final class and can't be inherited 
	 * we can't change final variable 
	 * final method can't be overridden
	 */
	
	
	int a = 12;
	final int b = 13;
	
	public final void  test12() {
		
	}
	
	public final void  test12(int w) {
		
	}
	
	public void test13() {
		final int rrr = 1;
		a++;
		//b++; final can't be changed
	}

}
