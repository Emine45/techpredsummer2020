package com.homework_day9;

public class For_Loop_Review_Questions {

	public static void main(String[] args) {
		
		/*
		  1.Questions
		  Write a program to print counting numbers from 10 to 57 on the console by using for-loop.
		 */
		for(int i=10; i<=57; i++ ) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		
	    /*
	       2.Question
	       Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.
	     */
		for(int i=100; i>=43; i-=2) {
				System.out.print(i + " ");
			
		}
		System.out.println();
		
		
		/*
		  3.Question
		  Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop.
		 */
		
		for(int i=199; i>=33; i-=2) {
				System.out.print(i + " ");
		}
		System.out.println();
		
			/*
			  4.Question
			  Write a program to add counting numbers from 23 to 57 by using for-loop.
			  Print the sum on the console
			 */
	         int sum = 0; 
			
			for(int i = 23; i<=57; i++) {
				sum = sum + i;
			}
			System.out.print(sum);
			
			System.out.println();
			
			
			/*
			   5. Question
			   Write a program to multiply counting numbers from 7 to 15 by using for-loop.
			   Print the multiplication on the console
			 */
			 int multiply = 1;
				
				for (int i = 7 ; i<=15; i++) {
					multiply = multiply * i;
					
				}
				
				System.out.print(multiply);

				
				System.out.println();
			
			/*
			   6.Questions
			   Write a program to print counting numbers which are less than 200 
			   and divisible by 5 On the console by using for-loop.
			 */
			for(int i =1; i<200; i++) {
	        	if(i%5==0) {
	        		System.out.print(i + " ");
	        	}
			}
	}

}
