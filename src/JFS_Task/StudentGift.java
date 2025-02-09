package JFS_Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGift {
	public static void main(String[] args) {
		List<String> Student = Arrays.asList("Ashif","Prasanth","Pinki","Harish","Asiya","Abu");
		
		List<String> filtered= Student.stream()
				.filter(s -> s.startsWith("A"))
				.collect(Collectors.toList());
		
		 System.out.println("Students names start with 'A': " + filtered);	
	}
}
