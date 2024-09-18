package HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		
		String text = "Hello world!";
		
		// Splitting the text into words
		String[] words = text.split("");
		
		// Counting word frequency
		Map<String, Integer> wordCount = new HashMap<>();
		
		for(String word  : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0));
		}
		
		// Displaying word frequencies
		wordCount.forEach((word, count) -> System.out.println(word + ": " + count));;
		
	}
}
