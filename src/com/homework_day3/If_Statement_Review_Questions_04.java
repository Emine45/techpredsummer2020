package com.homework_day3;

import java.util.Scanner;

public class If_Statement_Review_Questions_04 {

	public static void main(String[] args) {
		/*
		  4) Ask user to enter the values of length and width of a rectangle, 
		  then check if it is square or not.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length and width a rectangle");
		double length = scan.nextDouble();
		double width = scan.nextDouble();
		
		if(length==width) {
			System.out.println("Square");
		}else {
			System.out.println("Rectangle");
		}
		scan.close();

	}

}
