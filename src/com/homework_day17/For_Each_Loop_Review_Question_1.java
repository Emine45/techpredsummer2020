package com.homework_day17;


public class For_Each_Loop_Review_Question_1 {

	public static void main(String[] args) {

		/*
		   For-each Question 1:
           Create an integer array find the sum of all elements by using for-each loop and print the sum on the console.
		 */
		
		int arr[] = {2,4,6,8};
        
		int sum = 0;
		for(int w : arr) {
			sum = sum + w;
		}
		System.out.println(sum);
		
	}

}
