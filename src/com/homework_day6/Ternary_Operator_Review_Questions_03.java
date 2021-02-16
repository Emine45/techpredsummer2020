package com.homework_day6;

import java.util.Scanner;

public class Ternary_Operator_Review_Questions_03 {

	public static void main(String[] args) {
		
		/*
		  Type java code by using ternary.
           Write a program to print absolute value of an integer entered by user.
		 */
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to get its absolute value");
		int num = scan.nextInt();
		
		
		
		int result = num>=0 ? (+1)*num :(-1)*num;
		System.out.println(result);
		
		scan.close();

	}

}
