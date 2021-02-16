package day20inheritancent;

import java.util.Scanner;

public class x3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade");
        int grade = scan.nextInt();
        
		if(grade>=0 && grade<=59) {
			System.out.println("F");
		}else if(grade>=60 && grade<=69) {
			System.out.println("D");
		}else if(grade>=70 && grade<=79) {
			System.out.println("C");
		}else if(grade>=80 && grade<=89) {
			System.out.println("B");
		}else if(grade>=90 && grade<=100) {
			System.out.println("A");
		}else {
			System.out.println("Not valid grade");
		}
		
	}

}
