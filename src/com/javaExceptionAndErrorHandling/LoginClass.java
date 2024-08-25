package com.javaExceptionAndErrorHandling;

import java.util.Scanner;

//user defined exception 'Login' class is creadted and extended to Exception class
class Login extends Exception {
	// Constructor is created and value is taken in the variable 's'
	Login(String s) {
		// calling of parent constructor
		super(s);
	}
}
public class LoginClass {

	public static void main(String[] args) {
		// some default password is stred in 'pass' variable for validation
		String pass = "Guvi#1234";
		Scanner scanner = new Scanner(System.in);
		// UserName got as input from user
		System.out.print("Enter username : ");
		String userName = scanner.nextLine();
		// Password got as input from user
		System.out.print("Enter password : ");
		String passWord = scanner.nextLine();
		// Used try catch method for user defined exception
		try {
			// if statement is used for validation whether
			// value of 'pass' and 'passWord' contains same value or not
			if (!pass.equals(passWord))
				// if condition is satisfied then error is thrown
				throw new Login("Enter password is incorrect");
			else
				System.out.println("Enter password is correct");
		} catch (Login e) {
			// Message is printed using getMessage() method
			System.out.println(e.getMessage());
		}

	}
}
