package day08stringmethodsnt;

public class StringMethods02 {

	public static void main(String[] args) {
		//12. startsWith() method determines whether a String begins with a 
		//    specific character/characters. It return boolean
		
		String str = "Tuesday night plans";
		System.out.println(str.startsWith("T"));  //true
		System.out.println(str.startsWith("Tue"));  //true
		System.out.println(str.startsWith("M"));  //false
		
		// To check which index has which character use startWith(Character, index)
		System.out.println(str.startsWith("s", 3));  //true
		
		//13. endWith() method determines whether a String ends with a 
		//    specific character/characters. It return boolean
		
		System.out.println(str.endsWith("s"));   //true
		System.out.println(str.endsWith("plans"));   //true
		System.out.println(str.endsWith("X"));  //false
		
	}

}
