package com.bit.stringNArray;

import org.junit.Test;

public class ArrayPractice {

	@Test
	public void test1() {
		int s[] = new int[2];

		// declare an array
		int ud[];
		// assign the size of the array as Array has fix size
		ud = new int[3];
		// assign value to the 1st object/element
		ud[0] = 100;
		// assign value to the 2nd object/element
		ud[1] = 200;
		// assign value to the 3rd object/element
		ud[2] = 300;

		System.out.println(ud[1]);

		for (int i = 0; i < ud.length; i++) {
			System.out.println(ud[i]);
		}

		for (int i = ud.length - 1; i >= 0; i--) {
			System.out.println(ud[i]);
		}

	}

	String num[] = { "12", "34", "22", "44", "45", "123" };
	String month[] = { "Jan", "feb", "mar" };
	int zip[] = { 12, 34, 9922, 3545, 3, 3495 };

	@Test
	public void getTheMaxOrMinValueFromAnArray() {
		// Arrays class
		int max = zip[0];

		for (int i = 1; i < zip.length; i++) {
			// if(zip[i] > max) { //max value
			if (zip[i] < max) { // minimum value
				max = zip[i];
			}
		}
		System.out.println(max);
	}

	public int test4() {
		int a = 100;

		return a;
	}

	@Test
	public int[] returnArray() {

		return zip;
	}

	@Test //TBD.............
	public void test5(int money[], int age) {
		System.out.println(age);
		int e = age;

		int x[] = new int[money.length];
		for (int i = 0; i <= money.length; i++) {
			x[i] = money[i];
			// System.out.println(x[i]);
		}

	}

	public void test6() {
		int z[] = { 12, 34, 9922, 3545, 3, 3495 };

		test5(z, 50);

	}

	@Test 
	public void arrayTest() {
		//array always has fixed size 
		//each data is considered as an object 
		int s[] = new int[3];
		s[0] = 111;
		s[1] = 1;
		s[2] = 166;
		//s[3] = 111; Array out of boundary exception
		
		//1st parameter is the number of parents and 2nd parameter is the number of child 
		int x[][] = new int[3][2];
		x[0][0] = 1;
		x[0][1] = 11;
		x[1][0] = 12;
		x[1][1] = 13;
		x[2][0] = 133;
		x[2][1] = 14;
		
		for(int i=0; i<x.length; i++) {//1st loop is for the parent
			for(int j=0; j<x[i].length; j++) {//2nd loop is for the children
				System.out.println(x[i][j]);
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
