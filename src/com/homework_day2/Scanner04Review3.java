package com.homework_day2;

import java.util.Scanner;

public class Scanner04Review3 {

	public static void main(String[] args) {
		//2)Type a program which calculates the cube of a number which is entered by user. 
        //Hint 1: Cube of a number is a x a x a
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cube of a number");
		int c = scan.nextInt();
		
		System.out.println("Cube:" + (c * c * c));
		
		scan.close();

	}

}
