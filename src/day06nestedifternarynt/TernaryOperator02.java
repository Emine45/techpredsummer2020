package day06nestedifternarynt;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		/*
		 Solve by using if-else and ternary
		 Type java code by using ternary, Ask user to enter an integer, if the integer is even,
         output will be “The integer is even”. If the integer is odd, output will be “The integer is odd”.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		//1. Way by using if-else
		if (num%2==0) {
			System.out.println("The integer is even from if-else");
		
		} else {
			System.out.println("The integer is odd from if-else");

	    }
		
		//2. Way by using ternary (Better)
		String result = num%2==0 ? "The integer is even from ternary" : "The integer is odd from ternary";
		System.out.println(result);
		
		//3. Way
		System.out.println(num%2==0 ? "The integer is even from ternary" : "The integer is odd from ternary");
		scan.close();

	}
}