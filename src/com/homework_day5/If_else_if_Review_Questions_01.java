package com.homework_day5;

public class If_else_if_Review_Questions_01 {

	public static void main(String[] args) {
		
		/*
		  1) Type java code by using if-else if() statement,
             if both of the two integers are positive, output will be the sum of them.
             If both of the two integers are negative, output will be the multiplication of them. 
             Otherwise; output will be “I cannot add or multiply different signed numbers”
		 */
		
		int a = 12;
		int b = 13;
		
		if(a>0 && b>0) {
			System.out.println(a+b);
		}else if(a<0 && b<0) {
			System.out.println(a*b);
		}else {
			System.out.println("I cannot add or multiply different signed numbers");
		}

	}

}
