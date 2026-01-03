import java.util.*;

/**
* 1. creating an ArrayList
*/
public class ArrayListCreationDemo {

	public static void main(String[] args) {
		
		// Empty ArrayLsit
		ArrayList<String> list1 = new ArrayList<>();
		
		// With inital capacity 
		ArrayList<String> list2 = new ArrayList<>(10);
		
		// from another collection
		List<String> list = List.of("A", "B", "C");
		ArrayList<String> list3 = new ArrayList<>(list);
		
		System.out.println(list1); // []
		System.out.println(list2); // []
		System.out.println(list3); // [A, B, C]
		
				
	}
}