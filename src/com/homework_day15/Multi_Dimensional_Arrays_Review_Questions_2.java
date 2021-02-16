package com.homework_day15;

public class Multi_Dimensional_Arrays_Review_Questions_2 {

	public static void main(String[] args) {
		/*
		  2) Find the product of the last elements in the array elements of the 
		     given multidimensional array { {1,2,3}, {4,5}, {6} }
		 */
		
		int arr[][] = {{1,2,3}, {4,5}, {6}};
		int product = 1;
		for(int i = 0; i<arr.length;i++) {
			int j = arr[i].length-1;
			product = product * arr[i][j];
			
		}
		System.out.println(product);
		
		
	}

}
