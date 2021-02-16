package com.homework_day2;

public class Concatenation01Review {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "Easy";
		
		int num1 = 4;
		int num2 = 6;
		
		System.out.println(str1 + str2);  //JavaEasy
		
		System.out.println(str1 + num1 + str2 + num2); //Java4Easy6
		
		System.out.println(num1 + num2 + str1);  //10Java
		
		System.out.println(str2 + (num1 + num2));  //Easy10
		
		System.out.println(str1 + num1 + num2);  //Java46
		
		System.out.println(str1 + " " + str2);  //Java Easy
		
		//how can you print Easy24Java-2 on the console
		System.out.println(str2 + (num1*num2) + str1 +(num1-num2));
		
		//how can you print Java10Easy1 on the console
		System.out.println(str1 + (num1 + num2) + str2 + (num2 / num1));
	}

}
