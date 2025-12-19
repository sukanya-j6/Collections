import java.util.*;

public class ArrayListSortingOperations {
	public static void main(String args[]) {
	
		List<String> list = List.of("JAVA", "SPRING", "SPRING FRAMEWORK", "Angular");
		ArrayList<String> list1 = new ArrayList<>(list);
		
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println("Natural order sort :- " + list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("Reverse order sort "+ list1);
		
		list1.sort((a,b) -> a.compareTo(b));
		System.out.println("Lambda Sorting" + list1);
		
	}
}