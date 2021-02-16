package com.homework_day3;

import java.util.Scanner;

public class If_Statement_Review_Questions_01 {

	public static void main(String[] args) {
		/*
		  1) Type java code, if an integer is even, output will be “The integer is even”.
             If the integer is odd, output will be “The integer is odd”.

		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		if(a%2==0) {
			System.out.println("The integer is even");
		}
		if(a%2!=0) {
			System.out.println("The integer is odd");
		}
		scan.close();
	}

}
