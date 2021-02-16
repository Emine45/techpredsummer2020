package com.homework_day7;

import java.util.Scanner;

public class Review_Question3 {

	public static void main(String[] args) {
		/*
		 Write a Java program user will choose answer among A, B, C, or D. 
		  If the answer is true, output will be “True.” If the answer is false, output will be
		    “False”. Correct answer is ‘C’ for the multiple option question.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the correct letter");
		char ch = scan.next().charAt(0);
		
    switch(ch) {
		case 'A':
			System.out.println("False");
			break;
		case 'B':
			System.out.println("False");
			break;
		case 'C':
			System.out.println("True");
			break;
		case 'D':
			System.out.println("False");
			break;
		default:
			System.out.println("Enter a valid letter");
			
			scan.close();
		}
	}

}
