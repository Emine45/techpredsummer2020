package com.homework_day15;

import java.util.Scanner;

public class Multi_Dimensional_Arrays_Review_Questions_5 {

	public static void main(String[] args) {
		/*
		 5) Ask user to enter long two sentences. 
		    Then type a program to count all “words” in the sentences.
		    For example; if user enters “Java is easy, if you study. 
		    Nothing is easy, if you do not study” output will be 14.
		    Hint: Use split()
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		
		String arr1[] = s.split(" ");
		System.out.println("The number of words: " + arr1.length);
		
		scan.close();
	
	}

}
