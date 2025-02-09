package JFS_Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsNull {
	
	public static void main(String[] args) {
		List<String> Liststrings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
		
		List<String> nullViewer = Liststrings.stream()
				.filter(s -> !s.trim().isEmpty()) 
				.collect(Collectors.toList());
		
		System.out.println(nullViewer);
	}
}
