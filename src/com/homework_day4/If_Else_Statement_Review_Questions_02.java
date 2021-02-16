package com.homework_day4;

import java.util.Scanner;

public class If_Else_Statement_Review_Questions_02 {

	public static void main(String[] args) {
	    
		/*
		  6) Type java code by using if-else statement,
           Write a program to print absolute value of a number entered by user.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to get its absolute value");
		int num = scan.nextInt();
		
		if(num>=0) {
			System.out.println((+1) * num);
		}else {
			System.out.println((-1) * num);
		}
		scan.close();

	}

}
