package com.java.basics;

public class C02_TypeCast {

	public static void main(String[] args) {


		byte a = 100;
		int x = a;  			 //implicit cast
		
		System.out.println(x);
		
		
		int y = 128;
		byte b = (byte) y; 		 //explicit cast   counts -128 to 0 to +128 
		
		System.out.println(b);
		
		
		
		

	}

}
