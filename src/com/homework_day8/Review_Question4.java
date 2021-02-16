package com.homework_day8;

import java.util.Scanner;

public class Review_Question4 {

	public static void main(String[] args) {
		
		 /*
        Ask user to enter his/her first and last name. If the first name is longer 
        output will be “First name is longer.” If the length of last name is equal
        To the length of last name output will be “First name and last name
        have same length.” Otherwise, output will be “Last name is longer”
        */
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter your first and then last name");
       String firstName = scan.nextLine();
       String lastName = scan.nextLine();
       
       
       if(firstName.length()>lastName.length()) {
           System.out.println("First name is longer");
       }else if(lastName.length()== firstName.length()) {
           System.out.println("First name and last name has same length");
       }else {
           System.out.println("Last name is longer");
       }
       
       scan.close();

	}

}
