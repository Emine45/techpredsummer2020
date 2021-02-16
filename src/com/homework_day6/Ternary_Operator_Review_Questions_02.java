package com.homework_day6;

import java.util.Scanner;

public class Ternary_Operator_Review_Questions_02 {

	public static void main(String[] args) {
		/*
		  Type java code by using ternary and if-else.
		  Ask user to enter two integers
        Write a program to print the minimum one on the console.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//if-else Statement
		if(a<=b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		
		//Ternary Operator
		int result = a<=b ? a : b;
		System.out.println(result);
		
		scan.close();

	}

}
