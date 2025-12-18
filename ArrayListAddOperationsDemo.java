import java.util.*;

public class ArrayListAddOperationsDemo {

	public static void main(String[] args) {
		
		// empty ArrayList
		ArrayList<String> list1 = new ArrayList<>();
		
		// ArrayList with initial capacity
		ArrayList<String> list2 = new ArrayList<>(10);
		
		// From another collection
		List<String> list = List.of("A", "B", "C");
		ArrayList<String> list3 = new ArrayList<>(list);
		
		// add element
		list1.add("JAVA");
		
		// add at index
		list1.add(1, "Hiberanate");
		
		// add multiple elements
		list2.addAll(List.of("AWS", "GCP"));
		list3.addAll(2,List.of("Oracle", "Angular"));
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}
}

