package com.homework_day3;

import java.util.Scanner;

public class If_Statement_Review_Ouestions_02 {

	public static void main(String[] args) {
		/*
		  2) Type java code by using if statement. 
		  When you enter the initial of the day of a week, 
		  output should be all possible names of the days.
          For example; if the initial is ’S’ 
          output should be “Saturday or Sunday”
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an initial");
		char initial = scan.nextLine().charAt(0);
		
		if(initial=='S') {
			System.out.println("Saturday or Sunday");
		}
		if(initial=='M') {
			System.out.println("Monday");
		}
		if(initial=='T') {
			System.out.println("Tuesday or Thursday");
		}
		if(initial=='W') {
			System.out.println("Wednesday");
		}
		if(initial=='F') {
			System.out.println("Friday");
		}
		
	    scan.close();
	    
	}

}
