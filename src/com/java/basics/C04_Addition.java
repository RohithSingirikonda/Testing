package com.java.basics;

public class C04_Addition {

	public static void main(String[] args) {
		
		String x = "10";
		String y = "20";
		
		System.out.println(x+y);      //  1020   Need to convert to integer/byte/long
		
		
		Byte a = Byte.parseByte(x);
		Byte b = Byte.parseByte(y);		//Wrapper classes are used to convert data types
		
		System.out.println(a+b);	   // 30  
		
		
		
		

	}

}
