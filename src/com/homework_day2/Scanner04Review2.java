package com.homework_day2;

import java.util.Scanner;

public class Scanner04Review2 {

	public static void main(String[] args) {
		/*Type a program which calculates the area and the perimeter of a rectangle
        whose length and width are entered by user.
        Hint 1: Area of a rectangle is width x length
        Hint 2: Perimeter of a rectangle is 2x (width + length) 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width and the length of the rectangle");
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		
		System.out.println("Area:" + (width * length));
		System.out.println("Perimeter:" + (2* (width + length)));

		scan.close();
		
	}
}
