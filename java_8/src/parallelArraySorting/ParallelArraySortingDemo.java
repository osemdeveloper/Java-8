package parallelArraySorting;

import java.util.Arrays;
import java.util.Random;

public class ParallelArraySortingDemo {
	public static void main(String[] args) {
		int arraySize = 10000000; // Large elements
		int[] numbers = generateRandomArray(arraySize);

		// sequential sorting
		long startTime = System.currentTimeMillis();
		Arrays.sort(numbers);
		long endTime = System.currentTimeMillis();
		System.out.println("Sequential sorting time: " + (endTime - startTime) + "ms");

		// shuffle the array to prepare for parallel sorting
		shuffleArray(numbers);

		// Parallel sorting
		startTime = System.currentTimeMillis();
		Arrays.parallelSort(numbers);
		endTime = System.currentTimeMillis();
		System.out.println("Paralel sorting time: " + (endTime - startTime) + "ms");
	}

	private static int[] generateRandomArray(int size) {
		int[] array = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt(size * 10); // generating random integers

		}
		return array;
	}

	private static void shuffleArray(int[] array) {
		Random random = new Random();
		for (int i = array.length - 1; i > 0; i--) {
			int index = random.nextInt(i + 1);

			// swap array elements
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}

}
