package com.bit.statement;

import org.junit.Test;

public class SingleStstement {
	/*
	 Operator: https://www.w3schools.com/java/java_operators.asp
	 
	 singleStatement:
	  
	 multilpleStatement:
	 
	 
	 
	 */
	
	int a = 10;
	int b = 20;
	
	@Test
	public void test() {
		
		//test2("queen");
		test3("Manhattann");
	}
	
	@Test
	public void test1() {
		/*anytime we want to perform any action and if the condition is true 
		 * then we want to execute the if block, we will have to use if() statement
		 * in the case where if condition is false and we want to perform another action
		 * then we will use else alongside if
		 * 
		 * we can have as many if in a method and each of them are separate
		 * 
		 * if takes only boolean condition
		 if the condition is true then compiler will execute if block
		 */
		
		boolean c = a > b;
		//break;
		//continue;
		
		if(a > b) {
			System.out.println("1st if");
		}
		
		if(10 < 20) {
			System.out.println("2nd if");
		}
		
		if(c) {
			System.out.println("3rd if");
			
		}else {
			System.out.println("3rd if else block");
		}
		
	}
	
	
	public void test2(String cityName) {
		String city = cityName.toUpperCase();
		
		String city1 = "Bronx".toUpperCase();
		String city2 = "Brooklyn".toUpperCase();
		String city3 = "Queens".toUpperCase();
		String city4 = "Manhattan".toUpperCase();
		String city5 = "Staten Island".toUpperCase();
		
		if(city1.equals(city)) {
			System.out.println("Thanks, you live in the " + city1);
			
		}else if(city2.equals(city)) {
			System.out.println("Thanks, you live in the " + city2);
			
		}else if(city3.equals(city)) 
			System.out.println("Thanks, you live in the " + city3);
			
		else if(city4.equals(city)) {
			System.out.println("Thanks, you live in the " + city4);
			
		}else if(city5.equals(city)) {
			System.out.println("Thanks, you live in the " + city5);
			
		}else {
			System.out.println("You must live in NYC");
		}
		
	}
	
	
	public void test3(String cityName) {
		//switch always works with data / argument
		//
		
		
		String city = cityName.toUpperCase();
		
		switch(city) {
		
			case "BRONX":{
				System.out.println("case Bronx");
				break;
			}
			case "QUEENS":
				System.out.println("Case queens");
				break;
				
			case "MANHATTAN":
				System.out.println("Case Manhattan");
				break;
				
			case "BROOKLYN":{
				System.out.println("Case brooklyn");
				break;
			}
			case "STATEN ISLAND":
				System.out.println("case staten island");
				break;
			default:
				System.out.println("You must live in NYC");
		
		}
	
	}

}
