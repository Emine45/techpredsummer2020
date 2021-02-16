package com.homework_day17;

import java.util.ArrayList;
import java.util.List;

public class For_Each_Loop_Review_Question_2 {

	public static void main(String[] args) {

		/*
		   /*
		   For-each Question 2:
           Create a list find the sum of all elements by using for-each loop and print the sum on the console.
		 */
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		
		int sum = 0;
		for(int w : list1) {
			sum = sum + w;
		}
		System.out.println(sum/list1.size());
		
	}

}
