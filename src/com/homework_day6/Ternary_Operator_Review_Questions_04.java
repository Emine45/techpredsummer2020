package com.homework_day6;

import java.util.Scanner;

public class Ternary_Operator_Review_Questions_04 {

	public static void main(String[] args) {
		/*
		 Type java code by using using ternary.
        Take values of length and width of a rectangle from user and check if it is square or not.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and width for a rectangle");
		int length = scan.nextInt();
		int width = scan.nextInt();
		
		String result = width==length ? "Square" : "Rectangle";
		System.out.println(result);
			
		scan.close();
	}

}
