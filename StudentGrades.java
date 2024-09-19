package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class StudentGrades {

	public static void main(String[] args) {
	
		Map<String, Integer> grades = new TreeMap<>();
		
			grades.put("Alice", 90);
			grades.put("Bob", 80);
			grades.put("Charlie", 70);
		
		// Displaying students and their grades in alphabetical order
		grades.forEach((name, grade) 
				-> System.out.println(name + ": " + grade));
		
	}
}
