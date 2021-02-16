package day19encapsulationnt;

public class Mammal extends Animal {
	
	boolean breathe = true;

	public static void main(String[] args) {

		
	}
	
	protected void feed(String name) {
		System.out.println(name + " can feet its baby");
	}

}
