package com.homework_day2;

public class TypeCastingO1Review {

	public static void main(String[] args) {
		//1. Auto Widening Casting :
		
		byte b1 = 23;
		short b2 = b1;
		System.out.println(b2);
		
		short s1 = 15;
		int s2 = s1;
		System.out.println(s2);
		
		int i1 = 10;
		long i2 = i1;
		System.out.println(i2);
		
		long l1 = 18;
		float l2 = l1;
		System.out.println(l2);
		
		float f1 = 28.0f;
		double f2 = f1;
		System.out.println(f2);
		
		int i3 = 40;
		float i4 = i3;
		System.out.println(i4);
		
		long l3 = 20;
		double l4 = l3;
		System.out.println(l4);
		
		//2.Explicit Narrowing Casting:
		
		short sh1 = 10;
		byte sh2 = (byte) sh1;
		System.out.println(sh2);
		
		int in1 = 5;
		short in2 = (short) in1;
		System.out.println(in2);
		
		long lo1 = 3;
		int lo2 = (int) lo1;
		System.out.println(lo2);
		
		float fl1 = 15.0f;
		long fl2 = (long) fl1;
		System.out.println(fl2);
		
		double do1 = 5;
		float do2 = (float) do1;
		System.out.println(do2);
		
		float ft1 = 2.3f;
		int ft2 = (int) ft1;
		System.out.println(ft2);
		
		
		
		

	}

}
