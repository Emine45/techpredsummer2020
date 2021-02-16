package com.homework_day2;

import java.util.Scanner;

public class Scanner04Review6 {

	public static void main(String[] args) {
		//Type a program which calculates the perimeter of a triangle 
		//whose  Side lengths are entered by user. (Use byte) 
		//Hint 1: Perimeter of a triangle is a + b + c
		//Hint 4: To get byte, use nextByte()
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side lengths of a triangle");
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		
		System.out.println("Perimeter:" + (a + b + c));
		
        scan.close();
	}

}
