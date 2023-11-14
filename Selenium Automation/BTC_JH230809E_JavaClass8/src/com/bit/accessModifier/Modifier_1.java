package com.bit.accessModifier;

public class Modifier_1 {

	int a = 10;
	public String s = "hi";
	protected boolean d = 1 > 2;
	private byte h = 127;

	// inner class can have any access modifier
	private class Abc {

		class TTT {

		}

	}

	void test1() {
		int a = 10;
	}

	public void test2() {
		byte h = 127;
	}

	protected void test3() {
		int a = 10;
		String s = "hi";
	}

	private void test4() {
		int a = 10;
	}
}

//additional class can be default
class Xyz {

}

class Tr {

}