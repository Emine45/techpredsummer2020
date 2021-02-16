package com.homework_day16;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIst_Questions_1_2_3_4_5 {

	public static void main(String[] args) {

		/*
		   1)Create a String list whose elements are A, C, E, and F. Print it on the console.
		 */
		
		List<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("C");
		l1.add("E");
		l1.add("F");
		System.out.println(l1);
		
		
		 /* 2) By using add() with index method, add B into the 1st index.
               List elements should be like A, B, C, E, and F. Print it on the console
		 */
		
		l1.add(1, "B");
		System.out.println(l1);
		
		
		/*
		  3) By using set() method, convert E to D.
             List elements should be like A, B, C, D, and F. Print it on the console
		 */
		l1.set(3, "D");
		System.out.println(l1);
		
		
		/*
		  4) By using remove() method, remove F from the list.
             List elements should be like A, B, C, D. Print it on the console
		 */
		l1.remove(4);
		System.out.println(l1);
		
		
		/*
		   5)Find the size of the list and print the size on the console.
		 */
		System.out.println(l1.size());
		
	}

}
