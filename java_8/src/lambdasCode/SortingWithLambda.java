package lambdasCode;

import java.util.*;

public class SortingWithLambda {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(6);
		numbers.add(45);
		numbers.add(62);
		numbers.add(26);
		numbers.add(0);
		
		//Sorting in ascending order using lambda
		Collections.sort(numbers, (n1, n2) -> n1.compareTo(n2));
		System.out.println("Sorted inn Ascending: " + numbers);
	}

}
