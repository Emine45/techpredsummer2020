package com.homework_day14;

import java.util.Arrays;

public class Arrays_Review_Questions {

	public static void main(String[] args) {
		
		  /*
		    Type a program like; given an array whose length is 3, return an array with the
			elements "rotated left"
			For example; if the array is [1, 2, 3] output will be [2, 3, 1].
		 */
		   
		int arr[]= {1,2,3};
		System.out.println(Arrays.toString(arr));
		
		int rotatedArr[]=new int[arr.length];
		for(int i =0 ; i<arr.length-1;i++ ) {  
			rotatedArr[i]=arr[i+1];
		}rotatedArr[2]=arr[0];
		System.out.println(Arrays.toString(rotatedArr));

	}

}
