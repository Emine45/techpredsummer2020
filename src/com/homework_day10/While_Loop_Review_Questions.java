package com.homework_day10;

import java.util.Scanner;

public class While_Loop_Review_Questions {

	public static void main(String[] args) {
		/*
		  1)Type java code by using while loop, 
		  Write a program to print numbers from 1 to 5.
		 */
		
		int i = 1;
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		/*
		 2)Type java code by using while loop.
		 Write a program that types first 30 consecutive odd integers. 
		 */
		
		int j=1;
      
        while(j<=30) {
        System.out.print(2*j-1 + " ");
        j++;
        
         }
        System.out.println();
        
         /*
          3)Type java code by using while loop,
	        Write a program that prompts the user to input a positive integer.
	        It should then print the multiplication table of that number.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int b = scan.nextInt();
        
        int c = 1;
		while(c<=10) {
			System.out.println(b + "x" + c +" = " + b*c);
			c++;
		}
        
        
        System.out.println();
        
        /*
         4)Type java code by using while loop,  
         Write a program that prompts the user to input a positive integer.  
         It should then print factorial of that number.
         */
        
        System.out.println("Enter an integer");
        int d = scan.nextInt();

		int e =1;
		int fct = 1;
		while(e<=d) {
			fct = fct*e;
			e++;
			
		}
		System.out.print(fct);	
		
		
        
        
        System.out.println();
        /*
          5) Type java code by using while loop,  
           Write a program to count the factors of an integer which is entered by user.
         */
         
          System.out.println("Please enter an integer");
          int num = scan.nextInt();
          
          int m = 1;
          int count = 0;
          
          while(m<=num) {
        	  if(num%m==0) {
        		  System.out.print(m + " ");
        		  count++;
        	  }
        	  m++;
          }
          System.out.println();
          System.out.print("Factors number:" + count);
      
        
        
        
        System.out.println();
        
        /*
         6)Type java code by using while loop,  
         Write a program that prompts the user to input an integer.  
         It should then find sum of the digits of that number.
         */
        
       
        System.out.println("Enter an integer");
        int a = scan.nextInt();
        
        int sum = 0;
        
        while(a != 0) {
        	int lastDigit = a % 10;
        	sum = sum + lastDigit;
        	a = a /10;
        }
        System.out.println("sum:" + sum);
        scan.close();

	}

}
