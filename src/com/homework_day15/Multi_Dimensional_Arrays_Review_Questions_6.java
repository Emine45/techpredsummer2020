package com.homework_day15;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Review_Questions_6 {

	public static void main(String[] args) {

		 /*
		   6) Write a Java program to remove a specific element from an array.
		 */
		
		int a[] = {13,15,18,21};
		int b[] = new int[a.length-1];
		
		int idx = 2;
		int k =0;
		
		for(int i = 0; i<a.length; i++) {
			if(i==idx) {
				continue;
			}
			b[k]=a[i];
			k++;
		}
		System.out.println("Old Array: " + Arrays.toString(a));
		System.out.println("New Array: " + Arrays.toString(b));
		
		
	}

}
