package com.homework_day2;

import java.util.Scanner;

public class Scanner04Review8 {

	public static void main(String[] args) {
	    //Type a program which converts the hours to seconds. Hours value will be 
    	//entered by user. (Use long) 
		//Hint 1: second = hour x 60 x 60
		//Hint 2: To get long, use nextLong()
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the hours value");
		long hours = scan.nextLong();
		
		System.out.println("Second:" + (hours * 60 * 60));
		
		scan.close();
	}

}
