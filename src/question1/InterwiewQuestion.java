package question1;

public class InterwiewQuestion {
	

	/*
	 A String will be given to you
	 You will find zero, one, two, three, ... , nine from the String
	 If you find one you will print 1, if you find two you will print 2, ... on the console
	 For example; "aotcmnactdfewo"  ==> one -> 1 and two -> 2 
	*/

	public static void main(String[] args) {

		digits('o','n','e');
		digits('t','w','o');

	}
	
	public static void digits(char... c) {
		StringBuilder word = new StringBuilder("zewntsfnfffhninrevieovguwonhrxote");
		StringBuilder temp = new StringBuilder();
		String result = "";//switch statement does not accept StringBuilder as parameter
		temp = word;
		
		for(char w : c) {			
			for(int i=0; i<temp.length(); i++) {
				
				if(temp.charAt(i)==w) {
					result = result + temp.charAt(i);
					temp.delete(0, i+1);
					break;
				}
			}				
		}	
		
		temp.delete(0, temp.length());
		
       switch(result) {
	        case "zero":
				System.out.println("zero: " + 0);
				break;
			case "one":
				System.out.println("one: " + 1);
				break;
			case "two":
				System.out.println("two: " + 2);
				break;
			case "three":
				System.out.println("three: " + 3);
				break;
			case "four":
				System.out.println("four: " + 4);
				break;
			case "five":
				System.out.println("five: " + 5);
				break;
			case "six":
				System.out.println("six: " + 6);
				break;
			case "seven":
				System.out.println("seven: " + 7);
				break;
			case "eight":
				System.out.println("eight: " + 8);
				break;
			case "nine":
				System.out.println("nine: " + 9);
				break;
			default:
				System.out.println("Just checks digits");
       }

	}

}
