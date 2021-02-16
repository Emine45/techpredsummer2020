package com.homework_day2;

import java.util.Scanner;

public class Scanner04Review4 {

	public static void main(String[] args) {
		//4)Type a program which calculates the volume of a rectangular prism whose 
		//whose length, width, and height are entered by user.
		//Hint 1: Volume of a rectangular prism is width x length x height
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width, length and height of the rectangular prism");
		int width = scan.nextInt();
		int length = scan.nextInt();
		int height = scan.nextInt();
		
		System.out.println("Volume:" + (width * length * height));
		
		scan.close();

	}

}
