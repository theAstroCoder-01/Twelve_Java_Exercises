package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListOperators {
	
	public static void main(String[] args) {
	
		List<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		
		// Adding 100 random integers to the list
		for(int i = 0; i < 100; i++) {
			numbers.add(random.nextInt(100));
		}
		
		// Calculating sum, average, max, and min.
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		int max = numbers.stream().mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE);
		int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
	}
}
