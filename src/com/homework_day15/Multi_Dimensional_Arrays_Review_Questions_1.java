package com.homework_day15;

public class Multi_Dimensional_Arrays_Review_Questions_1 {

	public static void main(String[] args) {

		//1) Find the sum of all elements in the multidimensional array { {1,2,3}, {4,5,6} }
		
		int arr[][] = {{1,2,3}, {4,5,6}};
		int sum = 0;
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			
			
		}
		System.out.println(sum);
		
	}

}
