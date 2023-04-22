package classObject;

public class Elephant {
	String name = "Tom";
	String color="red";
	int eyes=2;
	int tail=1;
	int leg=4;
	public void run() {
		System.out.println("Elephant can run slow");
	}
	public void tumpet() {
		System.out.println("Elephant tumpet");
	}
	public void walk() {
		System.out.println("Elephant can walk as other animals");
	}

	public static void main(String[] args) {
		Elephant e=new Elephant();
		e.run();
		e.tumpet();
		e.walk();
		System.out.println("Name of Elephant is: " +e.name);
		System.out.println("The Color of Elephant is: " +e.color);
		System.out.println("Elephant has " +e.eyes + "  eyes");
		System.out.println("Elephant has " +e.tail + "  tail");
		System.out.println("Elephant has " +e.leg + "  legs");
		

	}

}
