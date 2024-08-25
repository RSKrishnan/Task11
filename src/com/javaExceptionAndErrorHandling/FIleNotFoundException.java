package com.javaExceptionAndErrorHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FIleNotFoundException {

	public static void main(String[] args) throws FileNotFoundException {

		// file path is passed
		File file = new File("d.txt");
		// to check whether the file exists or not
		boolean exists = file.exists();
		System.out.println("Does the file exists : "+exists);
		//trying to read the file
		Scanner scan = new Scanner(file);
	}
}
