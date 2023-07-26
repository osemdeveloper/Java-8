package functionalInterface;

@FunctionalInterface
interface MathOperation {
	int operate(int a, int b);
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		// Example 1: Using lambda expression to implement the functional interface
		MathOperation addition = (a, b) -> a + b;
		MathOperation substraction = (a, b) -> a - b;
		MathOperation product = (a, b) -> a * b;

		System.out.println("Addition: " + operate(10, 5, addition));
		System.out.println("Substraction: " + operate(10, 5, substraction));
		System.out.println("Product: " + operate(10, 5, product));

		// Example 2: Using method reference to implement the functional interface
		MathOperation division = FunctionalInterfaceExample::divide;
		System.out.println("Division: " + operate(10, 5, division));

	}

	// A method that accepts a functional interface as a parameter
	private static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operate(a, b);
	}

	// A method that matches the signature of the functional interface
	private static int divide(int a, int b) {
		return a / b;
	}

}

/*
 * In the code above, we define a functional interface called MathOperation,
 * which contains a single abstract method operate(int a, int b). We then create
 * lambda expressions and a method reference to implement this functional
 * interface.
 * 
 * In Example 1, we create instances of MathOperation using lambda expressions
 * for addition, subtraction, and multiplication. The operate method takes two
 * integers and a MathOperation instance and performs the respective operation
 * using the functional interface's operate method.
 * 
 * In Example 2, we create a MathOperation instance using a method reference
 * FunctionalInterfaceExample::divide, where divide is a static method that
 * matches the signature of the MathOperation functional interface.
 * 
 * Functional interfaces are essential for leveraging the power of lambda
 * expressions and method references, enabling more concise and expressive code
 * for functional programming in Java. The @FunctionalInterface annotation is
 * optional but recommended, as it helps ensure that the interface adheres to
 * the functional interface contract (one abstract method) and provides clarity
 * to the readers of the code.
 */
