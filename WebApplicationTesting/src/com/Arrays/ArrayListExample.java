package com.Arrays;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList:- Collections of Java
		 Its a dynamic data structure
		Syntax:
		 List<dataType>arrayListName = new ArrayList<>();*/

		List<Object> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add("amma");
		arrayList.add(11.123);
		arrayList.add(11.2623f);
		arrayList.add(true);
		arrayList.add('A');
		
		//System.out.println(arrayList);
	//	System.out.println(arrayList.get(0));
		for (int index=0;index<arrayList.size();index++) {
			System.out.println(arrayList.get(index));
		}
		System.out.println();
		System.out.println("@@@@$$$$$$$$$@@@@@@@@&&&&&&&&*******");
		System.out.println();
		
		for(Object index:arrayList) {
			System.out.println(index);
		}
		
		
		
		
		
	}

}
