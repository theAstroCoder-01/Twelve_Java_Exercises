package LambdaExpressions;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndSorting {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// Filtering even numbers and sorting in descending order
		
		List<Integer> result = numbers.stream()
		
				.filter(n -> n % 2 == 0)
				.sorted((a, b) -> b - a)
				.collect(Collectors.toList());
		
		System.out.println("Filtered and Sorte Numbers: " + result);
		
	}
	
	
	
}
