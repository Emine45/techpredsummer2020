package com.homework_day6;

import java.util.Scanner;

public class Ternary_Operator_Review_Questions_01 {

	public static void main(String[] args) {
		/*
		 Type java code by using ternary and if-else,
		 Ask user to enter an integer, if the integer is even, output will be “The integer is even”. 
         If the integer is odd, output will be “The integer is odd”.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		//if=else statement
		if(a%2==0) {
			System.out.println("The integer is even for if-else");
		}else {
			System.out.println("The integer is odd for if-else");
		}
		
		//Ternary Operator
		String result = a%2==0 ? "The integer is even for ternary" : "The integer is even for ternary";
		System.out.println(result);
		
		
		scan.close();

	}

}
