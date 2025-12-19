import java.util.*;

public class ArrayListBinarySearch {
	public static void main(String[] args) {
	
		List<String> list = List.of("JAVA", "SPRING", "SPRINGBOOT", "MICROSERVICES", "ANGULAR");
		ArrayList<String> list1 = new ArrayList<>(list);
		
		Collections.sort(list1);
		int index = Collections.binarySearch(list1, "JAVA");
		
		System.out.println(index);
	}
}