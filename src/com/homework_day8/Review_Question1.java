package com.homework_day8;

import java.util.Scanner;

public class Review_Question1 {

	public static void main(String[] args) {
		
		/*
        Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
       If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
        and print it on the console.
        */
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter an integer");
       int a = scan.nextInt();
     
       if (a<0) {
          System.out.println(a);
       }else if (a<10 ){
         System.out.println("It's square: "+a*a);
       }else {
         System.out.println(2*a);
         
         scan.close();
     }

	}

}
