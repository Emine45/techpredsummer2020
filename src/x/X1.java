package x;

import java.util.Scanner;

public class X1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scan.nextInt();

		String result = (year%100==0) ? (year%400==0 ? "leap year" : "Not leap year") :
			                            (year%4==0 ? "leap year" : "Not leap year");
		System.out.println(result);
	}

}
