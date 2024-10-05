package LambdaExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}


public class CustomComparator {
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
			people.add(new Person("Alice", 30));
			people.add(new Person("Bob", 31));
			people.add(new Person("Charlie", 32));
			
			// Sorting by age using lambda
			people.sort(Comparator.comparingInt(p -> p.age));
			
			System.out.println("Sorted by Age: " + people);
		
	}
	
}
