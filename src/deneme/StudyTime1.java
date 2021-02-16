package deneme;

import java.util.Scanner;

public class StudyTime1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.nextLine();
		
		//now there are 2 ways we know of to do this question.
		//1st is for loop(already done) 2nd one is StringBuilder
		
		StringBuilder strb = new StringBuilder(str);//By writing this code, String str is converted to StringBuilder strb
		//after this conversion we can use StringBuilder method which is reverse.
		
		//strb.reverse();//its reversed now but still StringBuilder we have to convert this back to String by using toString method
		
		//strb.reverse().toString();//now this is string.
		
		String reversed = strb.reverse().toString();//you just write this code please.Above 2 lines are extra for explanation.
		
		//now we can start compare our 2 strings using if else statement.remeber to use equals method for strings
		
		if(str.equals(reversed)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		scan.close();
	}

}
