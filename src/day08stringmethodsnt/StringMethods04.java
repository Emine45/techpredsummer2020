package day08stringmethodsnt;

import java.util.Scanner;

public class StringMethods04 {

	public static void main(String[] args) {
	  /*
	   * Ask user to enter his/her first name, last name and Social Security Number. 
         Then type a program which makes initials of the first name and 
         the last name in upper case, other characters will be in lower case.
         All characters except last 4 characters of the Social Security Number “ * ”.
                       For example; Suleyman Alptekin *****5678
	   */
		
		Scanner scan = new Scanner(System.in);
		
	  //2) Find the index of the initials of the words in your password
		String psw = " Hey Come1 ";
		System.out.println("initials of the first words in your password: " + psw.indexOf('H'));
		System.out.println("initials of the second words in your password: " + psw.indexOf('C'));
		
	  //3) Find the last index of any character which is repeated in your password
		System.out.println("last index of 'e': " + psw.lastIndexOf('e'));
		
	  //4) Replace * for all numbers in your password
		System.out.println(psw.replaceAll("\\d", "*"));
		
	  //5) Replace ? for all non-words in your password
		System.out.println(psw.replaceAll("\\W", "?"));
		
	  //6) Replace // for the second character of your password
		System.out.println(psw.replace("e", "//"));
		
	  //7) Print your password without any space at the beginning and at the end of the password.
	  //Find the length of your password before trim and after trim. (edited) 
		System.out.println(psw.trim());
		System.out.println("psw length before trim: " + psw.length());
		System.out.println("psw length after trim: " + psw.trim().length());
		
	  //8)Print your password on the console by starting from the 4th character (edited) 
		System.out.println(psw.substring(4));
		
	  //9) Print the characters of your password from 2nd character to 7th character
		System.out.println(psw.substring(2, 8));
		
	  //10)Print your password on the console like all characters in upper case
		System.out.println(psw.toUpperCase());
		
	  //11)Print your password on the console like all characters in lower case
		System.out.println(psw.toLowerCase());
		
		scan.close();
	
	}

}
