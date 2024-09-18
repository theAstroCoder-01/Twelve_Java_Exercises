package HashMap;

import java.util.HashMap;
import java.util.Map;

class Employee {
	
	String name;
	String position;
	
	Employee(String name, String position) {
		this.name = name;
		this.position = position;	
	}
	
	@Override
	public String toString() {
		return name + " (" + position + ")";
	}
}

public class EmployeeDatabase {

	public static void main(String[] args) {
		
		Map<Integer, Employee> employees = new HashMap<>();
			
			employees.put(1, new Employee("Alice", "Manager"));
			employees.put(2, new Employee("Bob", "Developer"));
			employees.put(3, new Employee("Charlie", "Analyst"));
			
			// Retrieve employee by ID
			int searchId = 2;
			Employee emp = employees.get(searchId);
				if(emp != null) {
					System.out.println("Employee found: " + emp);
				} else {
					System.out.println("Employee not found.");
		
		}
	}
}
