package com.javaExceptionAndErrorHandling;

public class ArrayOutOfBoundAndStringOutOfBound {

	public static void main(String[] args) {

		try {
			System.out.println("Array index out of bound Exception");
			//array with size 4
			int a[]= {1,2,3,4};
			//trying to add the number '9' to array position '7'
			a[7]=9;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//exception is handled and printed the message
			System.out.println(e);
		}
		
		try {
			System.out.println("\nString index out of bound Exception");
			//Str is string and assigned with value as Tamil Nadu
			String str= "Tamil Nadu";
			//length of string is calculated
			int length = str.length();
			System.out.println("Length of the String : "+length);
			//Trying to retrieve the value of the string at position of 20
			char charAt = str.charAt(20);
			System.out.println(charAt);
			
		} catch (StringIndexOutOfBoundsException e) {
			//exception is handled and printed the message
			System.out.println(e);
		}
	}

}
