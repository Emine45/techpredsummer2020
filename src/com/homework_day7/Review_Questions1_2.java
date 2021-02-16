package com.homework_day7;

import java.util.Scanner;

public class Review_Questions1_2 {

	public static void main(String[] args) {
		/*
		 Type code which types “even” for even integers, and “odd” for odd integers on console.
		 If the user pressed 1, 2, 3 the program will print the number that is pressed;
		 otherwise, program will print "Not allowed"
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer number");
		int a = scan.nextInt();
		
     switch(a) {
		 case 1:
		   System.out.println("Your integer is odd");
		   break;
		 case 2:
		   System.out.println("Your integer is even");
		   break;
		 case 3:
			 System.out.println("Your integer is odd");
			 break;
		 default:
			 System.out.println("Not allowed");
			 
			 scan.close();
			
		}
     
     

	}

}
