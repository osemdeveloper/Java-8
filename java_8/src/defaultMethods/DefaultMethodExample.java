package defaultMethods;

//Interface with default method

interface Greeting{
	//Abstract method
	void greet();
	
	//default method with a default implementation
	default void greetDefault() {
		System.out.println("Hello, Default");
	}
}

//Class implementing the interface
class GreetingImpl implements Greeting{

	@Override
	public void greet() {
		System.out.println("Hello, World");
		
	}
	
}
public class DefaultMethodExample {
	
	public static void main(String[] args) {
		GreetingImpl greetingImpl = new GreetingImpl();
		greetingImpl.greet();
		greetingImpl.greetDefault();
	}

}
