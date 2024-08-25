package com.javaExceptionAndErrorHandling;

import java.util.Scanner;

public class ArithmeticExceptionSample {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter two numbers : ");
			//user input is assigned to a and b variable
			int a =scanner.nextInt();
			int b =scanner.nextInt();
			//division is perform and getting error
			int c=a/b;			
		}catch (ArithmeticException e) {
			//error is catched and printed in catch method
			System.out.println(e);
		}
	}

}
