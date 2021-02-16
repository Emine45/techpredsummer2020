package com.homework_day2;

import java.util.Scanner;

public class Scanner05AndScanner04Review9 {

	public static void main(String[] args) {
		//Type a program which asks user to enter his/her first name and last name,
		//then print it on the console.
		//Hint: To get String, use nextLine()
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		
		System.out.println(firstName + " " + lastName);
		
		scan.close();
	}

}
