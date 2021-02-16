package com.homework_day11;

import java.util.Scanner;

public class Do_While_Loop_Review_Questions_1_2_3_4_5 {

	public static void main(String[] args) {
		
		/*
		  1) Write a program to print numbers from 1 to 5 on the console by using do-while loop.
		 */
		
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
			
		}while(i<=5);
		
		System.out.println();
		
		
		/*
		  2) Write a program to print numbers from 10 to 3 on the console by using do-while loop.
		 */
		
		int j = 10;
		do {
			System.out.print(j + " ");
			j--;
			
		}while(j >= 3);
		
		
		System.out.println();
		
		
		/*
		  3) Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
             by using do-while loop.
		 */
		
		int k = 1;
		do {
			if(k%5==0) {
				System.out.print(k + " ");
			}
			k++;
			
		}while (k<=100);
		
		
		  System.out.println();
		/*
		  4) Write a program to print letters from c to m on the console by using do-while loop.
		 */
		
		char ch = 'c';
		do {
			System.out.print(ch + " ");
			ch++;
			
		}while(ch<='m');
		
		
		System.out.println();
		
		/*
		 5) Ask user to enter a number.
//		    If the number is divisible by 10 then print "Won!" on the console
//		    otherwise ask user to enter another number.
//		    Use do-while loop.
		 */
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Enter a number");
			num = scan.nextInt();
			
		}while(num%10 != 0);
		    System.out.println("Won!");
		    
		    scan.close();
		
		
	}

}
