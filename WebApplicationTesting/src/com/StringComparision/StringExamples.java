package com.StringComparision;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1="LiveTech";
		String var2="SeleniumWebDriver";

		if(var1.equals(var2))
		{
		System.out.println(" var1 variable value is EQUAL to var2 variable value ");
		}
		else
		{
		System.out.println(" var1 variable value is NOT EQUAL to var2 variable value  ");
		}
		System.out.println();
		String var3="selenium";
		String var4="webdriver";
		if(var3.length()>var4.length()) {
			System.out.println("var3 variable value is graterthan to var4");
		}else {
			System.out.println("var4 variable value is graterthan to var3");
		}
		String var5="LiveTech";
		String var6="Livetech "; // a value along with a Space
		if(var5.equalsIgnoreCase(var6))
		{
		System.out.println(" var5 variable value is EQUAL to var6 variable value ");
		}
		else
		{
		System.out.println(" var5 variable value is NOT EQUAL to var6 variable value ");
		System.out.println();
		}

		int hello=var6.length();
		System.out.println(" The number of characters in the varaible var10 is :- "+hello);

		
		
	}

}
