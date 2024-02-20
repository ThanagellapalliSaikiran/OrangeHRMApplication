package com.Inheritance;

public class MethodExample2 extends MethodExample1 {
	
	// Inheritance Uses Extends keyWord - which will extend the respective class
	private void subtraction()
	{
	int var1=20;
	int var2=10;
	int var3;

	var3=var1-var2;
	System.out.println(" The value of the varibale var3 after Subtractiobn is :- "+var3);


	}


	public static void main(String[] args) {

	MethodExample2 m2 = new MethodExample2();
	System.out.println(" Method of MethodExample2 Java Class ");
	m2.subtraction();

	System.out.println();

	/*
	MethodExample1 m1 = new MethodExample1();
	System.out.println(" Method of MethodExample1 Java Class ");
	m1.addition();
	*/

	// When a Class is Extended - we need not create an Object for that Respective class to
//	    call the User Defined Methods
	// * using the current class Object itself we can call all the Extended class user Defined methods

	             // OR

	// Acquiring ALL the properties of One class into another Class using extends Keyword


	System.out.println(" Method of MethodExample1 Java Class ");
	m2.addition();

	System.out.println();
	System.out.println(" Method of MethodExample2 Java Class ");
	m2.multiplication();


	}

	public void multiplication()
	{
	int var1=20;
	int var2=10;
	int var3;

	var3=var1*var2;
	System.out.println(" The value of the varibale var3 after multiplication is :- "+var3);


	}

}
