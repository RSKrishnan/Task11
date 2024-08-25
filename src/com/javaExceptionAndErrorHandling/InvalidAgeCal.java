package com.javaExceptionAndErrorHandling;

import java.util.Scanner;

//User defined exception is defined and extended the exception for creation of user defined exception
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String s)
	{
		//calling constructor of parent exception
		super(s);
	}
}

public class InvalidAgeCal {
	
	public static void main(String[] args) {
		//Object created for scanner class
		Scanner scanner = new Scanner(System.in);
		//getting the input from user
		System.out.print("Enter the age of a person : ");
		//age is stored in variable 'age'
		int age = scanner.nextInt();
		//try and catch method is used
		try 
		{
			//if statement is used to check the age
			if(age<18)
			{
				//throw keyword is used to throw the exception
				throw new InvalidAgeException("Not eligible to vote due to age is less than 18 years");
			}
			else
				System.out.println("Eligible to vote");
		} 
		//User defined exception is used 'InvalidAgeException'
		catch(InvalidAgeException e)
		{
			//e.getMessage() is used to get the user defined exception message
			System.out.println(e.getMessage());
		}
		
	}

}
