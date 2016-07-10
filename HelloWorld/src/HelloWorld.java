
public class HelloWorld {

	public static void main(String args[]) {
		System.out.println("Hello World");
		
		Dog dog1 = new Dog("Ozzie", "Graham");
		
		System.out.println(dog1.getName() + " is owned by " + dog1.getOwner());
		
	}
	
}
