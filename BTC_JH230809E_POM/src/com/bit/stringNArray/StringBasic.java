package com.bit.stringNArray;

import java.util.Scanner;

import org.junit.Test;

import com.bit.test.BaseTest;

public class StringBasic {
	
	public void basicString() {

		int apple = 12;
		String orange = "Orange juice";

		/*
		 * String Literal - String Constant Pool > Whenever we create String Literal
		 * with same value, String pool will not create a new object rather it will use
		 * the same object reference and store the value. So instead of creating 2
		 * object it will refer to the same object. this way we are properly using
		 * memory and not wasting space.
		 */
		String str1 = "Hello";
		String str3 = "Hello";
		String str22 = "Hello";
		String str44 = "Hello";
		String str55 = "The New York Times is a daily newspaper based in New York City "
				+ "with a worldwide readership reported in 2022 to comprise 740,000 paid "
				+ "print subscribers, and 8.6 million paid digital subscribers. It also is a "
				+ "producer of popular podcasts such as The Daily. Founded in 1851, "
				+ "it is published by The New York Times Company";

		/*
		 * String Object - Heap > Whenever we create String object with same value,
		 * String Object will create separate reference for each Object
		 */
		String str2 = new String("Welcome");
		String str4 = new String("Welcome");
		String str5 = new String();

		String str6 = new String(
				"The New York Times is a daily newspaper based in "
				+ "New York City with a worldwide readership reported in "
				+ "2022 to comprise 740,000 paid print subscribers, and 8.6"
				+ " million paid digital subscribers. "
				+ "It also is a producer of "
				+ "popular podcasts such as The Daily. Founded in 1851, it is published by "
				+ "The New York Times Company");

		//BaseTest b = new BaseTest("Welcome");

		/*
		 * Mutable means changeable Immutable means NOT changeable String is always
		 * Immutable: if we change the value then String will create a new object and
		 * replace the original object
		 */

		str1 = "More Hello";
		String stradd = str1 + str2;
	}
	
	@Test
	public void practice() {
		int a = 10;
		String s = "hi today is Saturday";
		String s2 = "    hi today is Saturday    ";
		String p = new String("hi");
		String p1 = "Hi";
		String s1 = "";

		s.length();
		//Returns the length of this string.
		System.out.println(s.length());
		System.out.println("Char value : " + s.charAt(0));
		System.out.println(s.indexOf('y'));
		System.out.println("Last Index value: " + s.lastIndexOf('y'));
		int j = s.lastIndexOf('y');
		System.out.println("Last index -1 value : " + s.lastIndexOf('y', j-1));
		System.out.println(s.concat(s + "   concat method"));
		String dd = "Hi" + 125 + "@gmail.com";
		System.out.println("Hi today" + " is cold");
		System.out.println(s.contains("Is"));
		System.out.println(p.equals(p1));
		System.out.println(s.startsWith("hi today"));
		System.out.println(s.endsWith("Saturday"));
		
		
		p.equals(p1);
		boolean df = (p == p1);
		//equals() = ==
		int fr = 11;
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.length());
		String trimm = s2.trim();
		System.out.println(trimm.length());
		System.out.println(p1.replace('i', 'm'));
		System.out.println(s.replace('y','z'));
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 10));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

	}
	
	
//---------------------------------------------------------------------
	
	String num[] = {"12", "34", "22", "44", "45", "123"};
	int zip[] = {12, 34, 222, 345, 345};
	

	
	
	
	@Test
	public void printAnObjectByCharacter() {
		
		int x[] = new int[2];
		x[0] = 100;
		x[1] = 200;
		System.out.println(x[1]);
		
		String s = "hi today is Saturday";
		char a[] = s.toCharArray();
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	

	@Test
	public void printAnObjectByWord() {
		
		String s = "hi today is Saturday hi today is Saturday";
		String k[] = {"hi", "today", "is"};
		//String p[] = s.split(" ");
		String p[] = s.split(" ");
		//System.out.println(p[0]);
		
		for(int i=p.length-1; i>=0; i--) {
			System.out.println(p[i]);
		}

	}
	
	@Test
	public void removeAllTheSpaceAndPrintInReverseOrder() {
		
		String s = "hi today is Saturday hi today is Saturday";
		String d = s.replace(" ", "");
		char []r = d.toCharArray();
		char r1[] = s.replace(" ", "").toCharArray();
		
		for(int i=r1.length-1; i>=0; i--) {
			System.out.println(r1[i]);
		}
		
	}
	
	@Test
	public void compareObjectByHashCodeValue() {
		
		String a = "apple juice";
		String a1 = "juice apple";
		int s1 = a1.hashCode();
		int s = a.hashCode();
		System.out.println(s);
		System.out.println(s1);
		
		boolean g = a.equals(a1);
		System.out.println(g);
		System.out.println(s1 == s);
		System.out.println(a == a1);
		
		//= to assign any value
		//== logical equal operator 
		//equal()
		
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		
	}
	
	/*
	 * String vs StringBuffer vs StringBuilder
	 * 
	 * String: We have already learned String is immutable and they are stored in
	 * the Constant String Pool. Every immutable object in Java is Thread Safe.
	 * 
	 * StringBuffer: StringBuffer is mutable -> It can be change after it is
	 * defined. Its object is stored in heap. It is also Thread Safe. Performance is
	 * slow because of thread safety.
	 * 
	 * StringBuilder: StringBuilder is same as StringBuffer -> Value can be changed
	 * and object is stored in heap. The only difference is that, it is not Thread
	 * Safe. It is better in terms of performance because it is not thread safe and
	 * there are no checks done to verify thread safety. Thread Safe -> Two threads
	 * cannot simultaneously access the same method.
	 
	 */
	
	@Test
	public void stringBufferVsStringBuilder() {
		/*
		 * String Literal - String Constant Pool > Whenever we create String Literal
		 * with same value, String pool will not create a new object rather it will use
		 * the same object reference and store the value. So instead of creating 2
		 * object it will refer to the same object. this way we are properly using
		 * memory and not wasting space.
		 */
		String str1 = "Hello";
		String str3 = "Hello";

		/*
		 * String Object - Heap > Whenever we create String object with same value,
		 * String Object will create separate reference for each Object
		 */
		String str2 = new String("Welcome");
		String str4 = new String("Welcome");

		/*
		 * Mutable means changeable Immutable means NOT changeable String is always
		 * Immutable: if we change the value then String will create a new object and
		 * replace the original object
		 */

		str1 = "More Hello";

		String stradd = str1 + str2;
		
		String s = "by"; //immutable/notChangable
		s = "by";
		System.out.println(s);
		
		StringBuilder sbu = new StringBuilder();
	
		
		StringBuffer sb = new StringBuffer("hi");
		
		//s.equals(sb);
		String d = sb.toString();
		s.equals(d);
		
		System.out.println("Value of sb is : " + sb);
		System.out.println("Value of sb in reverse order is : " + sb.reverse());
		
		StringBuffer b = new StringBuffer("hi today is Sunday");
		//b.deleteCharAt(5);
		System.out.println(b.deleteCharAt(3));
		System.out.println(b.delete(3, 7));
		//1st argument is the position/index
		//2nd argument the value u want to insert or delete
		System.out.println(b.insert(2, 5));
		
		StringBuilder l = new StringBuilder("hi");
		
	}
	
	@Test
	public void parsing() {
		//convert data into one format to another 
		//we use 
	
		String b = "2.5";
		double b1 = Double.parseDouble(b);
		String a = "100";
		int a1 = Integer.parseInt(a);
		int ss = Integer.max(3864538, 345345532);
		System.out.println(ss);
		Integer.min(4564, 45645);
		Integer.sum(6234576, 345345);
		System.out.println(Integer.valueOf(345345));
	}
	
	@Test
	public void matchClass() {
		double a = (Math.random()*100);
		System.out.println("abcd"+a+"@gmail.com");
		double bv = Math.random();
		System.out.println(bv);
		
		
		//Scanner s = new Scanner();
	}
	
	
	
	
	@Test
	public void findDuplicateCharFromAString() {
		
		String s = "Today is Sunday Today is Sunday";
		char e[] = s.toCharArray();
		
		for(int i=0; i<e.length; i++) {
			
			for(int j=i+1; j<e.length; j++) {
				
				if(e[i] == e[j]) {
					System.out.println(e[i] + " is a duplicate value");
				}
			}
		}
	}
	
	int duplicateValue;
	
	//........................TBC....................................
	@Test
	public void findHowManyTimesAValueIsDuplicate() {
		
		String s = "Today is Sunday Today is Sunday";
		char e[] = s.toCharArray();
		
		for(int i=0; i<e.length; i++) {
			
			for(int j=i+1; j<e.length; j++) {
				
				if(e[i] == e[j]) {
					duplicateValue++;
					System.out.println(e[i] + " is a duplicate value");
				}
			}
			System.out.println("The count of duplicate value is : " + duplicateValue);
		}
	}
	
	/*
	 * A prime number is a whole number greater than 1 whose only factors are 1 and itself. 
	 * A factor is a whole number that can be divided evenly into another number. 
	 * The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29. 
	 * Numbers that have more than two factors are called composite numbers.
	 */
	
	@Test
	public void findAnumberIsPrinmeOrNot() {
		
		boolean flag = false;
		int x = 3;
		
		for(int i=2; i<x; i++) {
			
			if(x%i == 0) {
				System.out.println(x + " Is not Prime");
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println(x + " is prime number");
		}
		
		
	}
	
	/*
	 * Factorial in math is one of the operations (denoted by the symbol "!") and the factorial 
	 * of a number is the product of the number with all positive integers less than that number. 
	 * For example 8! (which is read as 8 factorial) = 8 · 7 · 6 ·5 · 4 · 3 · 2 · 1 = 40,320.
	 */
	
	@Test
	public void findAFactorialNumber() {
		//5..4..3..2..1
		int result = 1;
		int num = 5;
		
		for(int i = num; i>=1; i--) {
			result = i*result;
		}
		System.out.println(result);
	}
	
	@Test
	public void swapToNumber() {
		
		int a = 7;
		int b = 5;
		
		a = a + b;//12
		b = a - b;//7
		a = a - b;//5
		
		System.out.println("Value of a is : " +a);//5
		System.out.println("Value of b is : " +b);//7
		
	}
	
	/*
	 * The Fibonacci Sequence is the series of numbers: 
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number is found by 
	 * adding up the two numbers before it:.
	 */
	
	@Test
	public void finaAFibonacchiNumber() {
		
		int f1 = 1;
		int f2 = 1;
		int f3;
		
		for(int i=1; i<=5; i++) {
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.println(f3);
		}
		
	}
	
	/*
	 * A palindromic number is a number (such as 16461) that remains the same when 
	 * its digits are reversed. In other words, it has reflectional symmetry across a ...
	 */
	@Test
	public void findIfADataIsPalindrom() {
		String word = "16461";

		boolean flag = false;

		int j = word.length() - 1;

		if (word.equals("121") || word.length() < 2 || word.matches(".\\d.") || word.split(" ").length > 1) {

			System.out.println("wrong entry");

		} else {

			for (int i = 0; i < word.length(); i++, j--) {
				if (word.charAt(i) != word.charAt(j)) {
					System.out.println(word + " is not polindrom");
					flag = true;
					break;
				}
			}

			if (flag == false) {
				System.out.println(word + " is polinrom");
			}

		}

	}
	
	
	
	public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";
 
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
	
	
	
	

	
	

}
