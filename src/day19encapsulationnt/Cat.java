package day19encapsulationnt;

public class Cat extends Mammal {
	public boolean meow = true;

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		System.out.println("Can a cat meow? " + cat.meow);
		System.out.println("Can a cat breathe? " + cat.breathe);
		System.out.println("What is the weight in kg? " + cat.weight);
		cat.feed("Cat");
		cat.meoww("Cat");
		cat.move("Cat");
		

	}
	
	public void meoww(String name) {
		System.out.println(name + " purrs");
	}

}
