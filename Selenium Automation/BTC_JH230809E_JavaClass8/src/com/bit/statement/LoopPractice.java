package com.bit.statement;

import org.junit.Test;

public class LoopPractice {
	/*
	 while() 
	 do while()
	 for()
	 forEach/enhanced loop

	 */
	
	@Test
	public void execute() {
		//test5();
		//test7();
		test8();
	}
	
	int a = 1;
	int b = 5;
	
	void test5() {
		//while take boolean condition
		//as long as the condition is true loop will continue
		
		while(a < b) {
			System.out.println(a);
			a++;
			//b--;
		}
	}
	
	void test6() {
		//do will always execute once then check the condition
		//as long as the condition is true loop will continue
		do{
			System.out.println(a);
			a++;
		}while(a < b);
	}
	
	int c = 1;
	int d = 5;
	
	void test7() {
		//count vs index
		
		//for loop has 4 steps 
		//initialization - where do want to start the loop
		//condition - based on what condition we want to run the loop 
		//action - 
		//inc/dec - based on the condition we inc or dec
		
		for(int i = 1; i < d; i++) {
			
			System.out.println(i);
			
			for(int j=1; j<3; j++) {
				System.out.println("value of J " + j);
			}
		}
		
	}
	
	int g[] = {1, 3, 5, 7 , 8, 11, 22223, 5};
	public void test8() {
		//for each will increase by 1 by default
		for(int h : g) {
			System.out.println(h);
		}
	}
	
	
	
	
	
	
	
	

}
