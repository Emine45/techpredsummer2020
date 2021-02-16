package com.homework_day7;

import java.util.Scanner;

public class Review_Question4 {

	public static void main(String[] args) {
		/*
		 Type java code by using switch statement. 
		 A school has following rules for grading system: 
		 1. For 50 - C     2. For 80 - B.     4. For 100 - A  
		 Ask user to enter marks and print the corresponding grade.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade");
		int grade = scan.nextInt();
		
    switch(grade) {
        case 50:
        	System.out.println("C");
        	break;
        case 80:
        	System.out.println("B");
        	break;
		case 100:
			System.out.println("A");
			break;
		default:
			System.out.println("Grade is not valid");
		

			
		}scan.close();
	}

}
