package lambdasCode;

import java.util.*;
/*
 * Let's consider an example where we have a list of integers and want to print each element using method references.
 */

public class MethodReferenceExample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		// Using lambda expression to print each element
		numbers.forEach((n) -> System.out.println(n));

		// Using method reference to print each element
		numbers.forEach(System.out::print);

	}

}
