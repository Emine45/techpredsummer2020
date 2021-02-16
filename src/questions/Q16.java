package questions;

public class Q16 {
	int x, y;
	
	public Q16(int x, int y) {
		initialize(x,y);
	}

	public static void main(String[] args) {
		 int x=2, y=3;
		 
         Q16 obj = new Q16(x,y);
         //Constructor is not a method, it makes all updates for objects not for classes.
         //If you want to see the updates you have to call the class members by using objects otherwise you cannot 
         //see updates.
         
         System.out.println(obj.x + " - " + obj.y);//8 - 27
         System.out.println(x + " - " + y);//2 - 3
	}
	
	public void initialize(int x, int y) {
		this.x = x*x*x;
		this.y = y*y*y;
	}

}
