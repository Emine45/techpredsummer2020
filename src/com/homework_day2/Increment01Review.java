package com.homework_day2;

public class Increment01Review {

	public static void main(String[] args) {
		//1.way
		int num = 10;
		System.out.println(num); //10
		
		num = num + 5;
		System.out.println(num); //15
	
		//2. way
		int num2 = 10;
		System.out.println(num2);  //10
		
		num2+=5;
		System.out.println(num2); //15
		
		//3.way
		//num3 = num3 + 1; that one work but I will not use it
				//num3+=1; that one works but I will not use it as well
		int num3 = 10;
		System.out.println(num3);
		
		num3++;
		System.out.println(num3); //11
		
		// Create a double variable increase it by 1 in 3 different ways
		double d1 = 5.5;
		System.out.println(d1);  //5.5
		
		d1 = d1 + 1;
		System.out.println(d1);  //6.5
		
		d1+=1;
		System.out.println(d1);  //7.5
		
		d1++;
		System.out.println(d1);  //8.5
		
		//Increase the value of variable by using multiplication
		//1.way
		int n1 = 5;
		System.out.println(n1);  //5
		
		n1 = n1 * 5;
		System.out.println(n1);  //25
		
		//2.way
		int n2 = 5;
		System.out.println(n2);  //5
		
		n2*=5;
		System.out.println(n2);  //25
		
		
				
		
		
	}

}
