package com.homework_day2;

import java.util.Scanner;

public class Scanner04Review7 {

	public static void main(String[] args) {
		//Type a program which converts the mile to kilometer. Mile value will be 
		//entered by user. (Use double) 
		//Hint 1: km = mile x 1.6
		//Hint 2: To get double, use nextDouble()
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mile value");
		double mile = scan.nextDouble();
		
		System.out.println("km =" + (mile * 1.6));
		
		scan.close();

	}

}
