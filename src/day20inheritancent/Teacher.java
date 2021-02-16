package day20inheritancent;


public class Teacher {
	
	public String collegeName = "Good College";
	protected boolean basketball = true;

	public static void main(String[] args) {
		/*
		    Inheritance Project
         1)You have teachers
         2)You have Science, Math, and Art teachers
         3)Science teachers can teach Math at the same time but Math teachers cannot teach Science
         4)The college name is "Good College"
         5)All teachers know English and French
         6)Science and Art teachers know Spanish as well
         7)All teachers are able to play Basketball
         8)Art and Science teachers can play Soccer as well
		 */

	}
	
	public void speak() {
		System.out.println("They can speak English and French");
		
	}
	
	Teacher() {
		System.out.println("Teacher constructor");
	}

}
