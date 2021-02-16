package com.homework_day2;

public class Decrement01Review {

	public static void main(String[] args) {
		//1. Way
		int num = 10;
		System.out.println(num);  //10
		
		num = num - 5;
		System.out.println(num); //5
		
		//2. Way
		int num2 = 10;
		System.out.println(num2); //10
		
		num2-=5;
		System.out.println(num2); //5
		
		//3.Way  ==> This way is just for decreasing by 1
		int num3 = 10;
		System.out.println(num3);  //10
		
		num3--;
		System.out.println(num3);  //9
		
		//Create a float variable decrease it by 1 in 3 different way
		float f1 = 5.3f;
		System.out.println(f1); //5.3
		//1.way
		f1 = f1 - 2;
		System.out.println(f1);  //3.3
		//2.way
		f1-=2;
		System.out.println(f1);  //1.3
		//3.way
		f1--;
		System.out.println(f1);  //0.3
		
		//Create a variable and decrease the value by using division
		//1. Way
		double d1 = 8.4;
		System.out.println(d1); //8.4
		
		d1 = d1 / 4;
		System.out.println(d1);  //2.1
		
		//2.Way
		double d2 = 8.4;
		System.out.println(d2); // 8.4
		
		d2/=4;
		System.out.println(d2);  //2.1
		
		
		
		
		

	}

}
