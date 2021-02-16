package day06nestedifternarynt;

public class SwitchStatement01 {

	public static void main(String[] args) {
		//Switch Statement
		
		String gender = "male";
		
		switch(gender) {
		   case "male":
			   System.out.println("This is a man");
			   //break means go out of the switch
			   break;
			   
		   case "female":
			   System.out.println("This is a women");
			   break;
			   
			default:
				System.out.println("Undefined gender");
		}

	}
	

}
