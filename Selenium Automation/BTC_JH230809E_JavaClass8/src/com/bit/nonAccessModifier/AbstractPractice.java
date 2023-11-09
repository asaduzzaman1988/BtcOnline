package com.bit.nonAccessModifier;

public abstract class AbstractPractice {
	/*
	 * The abstract keyword is a non-access modifier, used for classes and methods:
	 * Abstract class: is a restricted class that cannot be used to create objects
	 * (to access it, it must be inherited from another class). Abstract method: can
	 * only be used in an abstract class, and it does not have a body.
	 * 
	 */

	void abcd() {

	}

	abstract void targetSignUp();

	abstract void targetSignIn();
}
