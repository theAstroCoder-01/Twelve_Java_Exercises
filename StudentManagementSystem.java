package ArrayList;

import java.util.ArrayList;
import java.util.List;

class Student {
	String name;
	int id;
	
	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name + " (ID: " + id + ")";
				
	}
}

public class StudentManagementSystem {
	public static void main(String[] args) {
	
		List<Student> students = new ArrayList<>();
			
			students.add(new Student("Alice", 1));
			students.add(new Student("Bob", 2));
			students.add(new Student("Charlie", 3));
			
		// Searching for a student by name
			
			String searchName = "Bob";
			Student foundStudent = null;
			for(Student s : students) {
				if(s.name.equals(searchName)) {
					foundStudent = s;
					break;
				}
			}
			
			if(foundStudent != null) {
				System.out.println("Found student");
			} else {
				System.out.println("Student not found");
			}
			
	}
}
