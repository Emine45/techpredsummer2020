package com.homework_day2;

import java.util.Scanner;

public class Scanner03AndScanner04Review1 {

	public static void main(String[] args) {
		/* Type a program which calculates the area and the perimeter of a square
        whose side length is entered by user.
        Hint 1: Area of a square is length x length
        Hint 2: Perimeter of a square is 4x length
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me length of the square");
		int length = scan.nextInt();
		
		System.out.println("Area:" + (length * length));
		System.out.println("Perimeter:" + (4 * length));
		
		scan.close();
	}

}
