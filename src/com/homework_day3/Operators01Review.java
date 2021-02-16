package com.homework_day3;

public class Operators01Review {

	public static void main(String[] args) {
		// Create three integer variables, name them as a, b, and c
	    //Print the result of (a + b*c) % (a+c)
		
		int a = 12;
		int b = 3;
		int c = 2;
		
		System.out.println((a + b*c) % (a + c));  //4
		
		// Create three integer variables, name them as a, b, and c
	    //Print the result of (c + a*b) % (a+b)
		
		System.out.println((c + a*b) % (a+b));  //8
		
		
		// Create three integer variables, name them as a, b, and c
	    //Print the result of (b + c*a) % (c+b)
		
		System.out.println((b + c*a) % (c+b)); //2 
				

	}

}
