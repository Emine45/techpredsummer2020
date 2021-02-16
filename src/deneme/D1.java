package deneme;

import java.util.Scanner;

public class D1 {

	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		StringBuilder stb = new StringBuilder(str);
		stb = stb.reverse();
		System.out.println(stb);
		 
		
	}

}
