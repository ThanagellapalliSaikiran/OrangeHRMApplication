package com.UserDefinedMethods;



public class MethodExample1 {
public  void sai() { // this the user defined method 
	// This method use to same package and multiple classes
	
	System.out.println("This the User Defined Method");
	
}
public static void main(String[] args) {
	MethodExample1 m1=new MethodExample1();
	m1.sai();
	System.out.println();
	m1.addition();
	System.out.println();
	m1.multiplication();
	System.out.println();
	m1.division();
	System.out.println();
	m1.addition1();
	
}
public void addition() {
	int var1=20;
	int var2=30;
	int var3;
	var3=var1+var2;
	System.out.println("The var1 var2 addition value is :-"+var3);
}
 private void multiplication() { //This method use only same package and same class 
	                             //This method use same class multiple time use
	 int var1=20;
	 int var2=30;
	 int var3;
	 var3=var1*var2;
	System.out.println("The var1 var2 multiplication value is :-"+var3);
}
 protected void division() {
	 
	 
	int var1=30;
	int var2=50;
	int var3;
	var3=var1/var2;
	
	System.out.println("The var 1 var 2 division value is :-"+var3);
	
	 
	 
	 
	
}
 void addition1() {
	 int var1=40;
	 int var2=50;
	 int var3;
	 var3=var1+var2;
	 System.out.println("The var1 var2 addition value is :-"+var3);
	 
 }

 
	 
	 
	 
	 
	 
	 
	 
 }
 

