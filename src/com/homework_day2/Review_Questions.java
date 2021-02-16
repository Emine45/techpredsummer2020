package com.homework_day2;

import java.util.Scanner;

public class Review_Questions {
	
        //2. Answer
	public static void main(String[] args) {
		
		 //3. Answer
		boolean hot = true;
		System.out.println(hot);
		
		boolean cold = false;
		System.out.println(cold);
		

		char initial = 'E';
		System.out.println(initial);
		
		
		int i = 2;
		System.out.println(i);
		
		
		byte b1 = 5;
		System.out.println(b1);
		
		
		short s1 = 23;
		System.out.println(s1);
		
		int i1 = 15;
		System.out.println(i1);
		
		long l1 =45;
		System.out.println(l1);
		
		float f1 = 2.34f;
		System.out.println(f1);
		
		
		double d1 = 4.65;
		System.out.println(d1);
		
		//4. Answer
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Give me two integer");
		 int num1 = scan.nextInt();
		 int num2 = scan.nextInt();
		 System.out.println("sum:" +(num1 + num2));
		 
		 scan.close();
		 
		 //5. Answer
		char firstName1 = 'E';
		System.out.print(firstName1 );	
		char firstName2 = 'M';
		System.out.print(firstName2);
		char firstName3 = 'I';
		System.out.print(firstName3);
		char firstName4 = 'N';
		System.out.print(firstName4);
		char firstName5 = 'E';
		System.out.println(firstName5);
		
		//6.Answer
		
		long minValueOfLong = Long.MIN_VALUE;
		System.out.println(minValueOfLong);
		
		long maxValueOfLong = Long.MAX_VALUE;
		System.out.println(maxValueOfLong);
		
		
		
		//7. Answer
		/*a. Primitive data types contain just value, non-primitive data types contain value and method.
		 * Primitives start with a lower case, non-primitives start with upper case
		 * Primitives are created by Java, we can not create primitive data types.
		 * Non-primitives can be created by programmer, Java created some as String
		 * b.Starting with lower case then every word starts with upper case letter.
		 * c.  We have to start with a letter (lower case), or the "$" or "_" character, but "$" and "_" are not recommended.
		 * d. Before create an application we need to decide future and functionality of application.
		 * For example; color,size,shape and the method. If we know make easier to create app.
		 */
		
	}

}
