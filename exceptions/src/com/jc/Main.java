package com.jc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * 	Exceptions treatment's with Try-Catch-Finally block
 * 	- ArrayIndexOutOfBoundsException
 * 	- InputMismatchException
 * 	- printStackTrace()
 * 	- FileNotFoundException
 *
 * 	Author: Natan Souza
 */

public class Main {

    public static void main(String[] args) {
    	// File treatment
			method1();
		// End

    	// Array && Input treatment
	    	method2();
		// End
    }

    public static void method1() {
    	File file = new File("C:\\temp\\in.txt");
    	Scanner sc = null;

    	try {
    		sc = new Scanner(file);
    		while (sc.hasNextLine()) {
    			System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
    		System.out.println("Error opening file: " + e.getMessage());
		} finally {
    		if (sc != null) {
    			sc.close();
			}
		}
	}

    public static void method2() {
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position.");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Input error.");
			e.printStackTrace();
		}

		sc.close();
	}
}
