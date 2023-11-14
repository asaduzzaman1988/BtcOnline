package com.bit.nonAccessModifier;

public class Modifier_5 {
	
	/* static is a non access modifier
	 * static can't work with non static
	 * non static can works with static 
	 * static property can be called anywhere in the project by class reference
	 * if the method is static then by default all of the local variable is static
	 * static always works with changed value and never goes back to it's original state
	 * if you declare method as a static you can overload that method but you cannot override
	 * we can use both access and non-access modifier based on our need
	 */
	
	static int a = 10;
	int c = 30 + a;
	int d = 40;
	//static int b = 20 + d;
	
	Modifier_5(int a, int d){
		this.a = a;
		this.d = d;
	}
	
	Modifier_5(){
		
	}
	
	
	public static void test1() {
		int g = 1;
		System.out.println(a);
		//System.out.println(d);
	}
	
	void test2() {
		int j = 2;
		System.out.println(a);
		System.out.println(d);
	}
	
	//we can overload but can't be override static method
	//why static method can't be overridden?
	static void test3() {
		
	}
	
	static class Apple{
		
	}

}

class TR{
	
}