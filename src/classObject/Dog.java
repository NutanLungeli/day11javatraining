package classObject;

public class Dog {
	String name ="Tommy";
	int eyes=2;
	int leg=4;
	
	public void run() {
		System.out.println("Dog can run");
	}
	public void bark() {
		System.out.println("Dog can bark");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
		d.bark();
		System.out.println("Name of Dog:" +d.name);
		System.out.println("Dog has eyes: " +d.eyes);
		System.out.println("Dog has leg: " +d.leg);
		

	}
	

}
