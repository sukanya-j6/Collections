import java.util.*;

public class ArrayListStreamOperations {

	public static void main(String args[]) {
	
		List<String> list = List.of("java", "Spring Framework", "Spring Boot", "MicroServices");
		ArrayList<String> list1 = new ArrayList<>(list);
		
		System.out.println(list1);
		
		// if length > 5 convert to uppercase and print
		list1.stream()
		.filter(s -> s.length() > 5)
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		// collect to a new ArrayList
		
		ArrayList<String> newList=list1.stream()
		.filter(s -> s.length() > 5)
		.collect(Collectors.toCollection(ArrayList::new));
		
		
	}
}