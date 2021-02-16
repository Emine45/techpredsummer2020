package com.homework_day11;

import java.util.Scanner;

public class Do_While_Loop_Review_Question_6 {

	public static void main(String[] args) {
		
		/*
		 6) Ask user to enter a name.
		    If the name contains the letter ‘a’ then print "Won!" on the console
    	    otherwise ask user to enter another name.
		    Use do-while loop
		 */
	
		Scanner scan = new Scanner(System.in);
		String str = " ";
		do {
			System.out.println("Enter your name");
			str = scan.nextLine();
		} while (!(str.contains("a")));
		System.out.println("Won!");
		
		scan.close();
	
	}

}
