package com.homework_day6;

import java.util.Scanner;

public class Ternary_Operator_Review_Questions_05 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String. If the String has 2 characters, output will be
        “It is valid for state abbreviations” 
        Otherwise, output will be “It is not valid for state abbreviations”
		 */
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the state abbreviation");
		String abr = scan.next().toUpperCase();
		
		String result = abr.length()==2 ? "It is valid for state abbreviations" : "It is not valid for state abbreviations";
		System.out.println(result);
		
		
		scan.close();

	}

}
