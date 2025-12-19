import java.util.*;

public class ArrayListFunctionalOperations {
	public static void main(String args[]) {
		
		List<String> list = List.of("JAVA", "SPRING FRAMEWORK", "SPRING BOOT", "MICROSERVICES");
		ArrayList<String> list1 = new ArrayList<String>(list);
		
		// forEach Lambda
		list1.forEach(l -> System.out.println(l));
		
		// forEach Method Reference
		list1.forEach(System.out::println);
	}
}