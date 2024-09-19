package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
	
	public static void main(String[] args) {
		
		Map<String, String> phoneDirectory = new TreeMap<>();
		
		phoneDirectory.put("Alice", "123-456-789");
		phoneDirectory.put("Bob", null);
		phoneDirectory.put("Charlie", null);
		
		// Displaying the phone directory
		phoneDirectory.forEach((name, phone)
				-> System.out.println(name + ": " + phone));
		
		
	}

}
