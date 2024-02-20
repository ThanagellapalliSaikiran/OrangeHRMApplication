package com.Arrays;

public class ObjectArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object array[]=new Object[7]; // Object single dimensional array

//Data type string group of characters
/*
array[0]="sai";
array[1]="madhu";
System.out.println(array[0]);
System.out.println(array[1]);
System.out.println();
array[2]=10;//int byte long short
array[3]=100.123;//double
array[4]=11.2326f";//float
array[5]=true;//boolean
	System.out.println(array[2]);
	System.out.println(array[3]);
	System.out.println(array[4]);
	System.out.println(array[5]);*/
array[0]="sai";//string group of characters
array[1]="madhu";//string group of characters
array[2]=10;//int byte long short
array[3]=100.123;//double
array[4]=11.2326f;//float
array[5]=true;//boolean
array[6]='D'; //char
/*for(int index=0;index<array.length;index++) {
	System.out.println(array[index]);
}*/


for(Object index :array) {
	System.out.println(index);
}


System.out.println();
System.out.println("_________________________***********_____________");
System.out.println();


Object array1[][]=new Object[2][2];
array1[0][0]="sai";      // string group of characters
array1[0][1]="madhu";    // string group of characters
array1[1][0]=11.2326f;   // float
array1[1][1]=true;       // boolean
for(int index=0;index<array1.length;index++)
{
  for(short rowOfCell=0;  rowOfCell<array1.length;  rowOfCell++)  
  {
	  System.out.println(array1[index][rowOfCell]);
  }
}






































	}

}
