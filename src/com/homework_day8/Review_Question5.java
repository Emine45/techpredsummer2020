package com.homework_day8;

import java.util.Scanner;

public class Review_Question5 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a word which has 4 letters and output will be inverse of the word.
		  For example; if user enters “MARK” output will be “KRAM”
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string which has 4 letters: ");
		String name = scan.next();
		
		String result = name.charAt(3)+""+ name.charAt(2)+ name.charAt(1)+ name.charAt(0);
		
		System.out.println(result);
		scan.close();
		
	}

	}

