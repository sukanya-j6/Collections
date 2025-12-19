import java.util.*;

public class ArrayListIterationOperations {
	
	public static void main(String args[]) {

		List<String> list = List.of("JAVA", "SPRING", "SPRINGBOOT", "MICROSERVICE", "ANGULAR", "TYPESCRIPT", "JAVASCRIPT");
		ArrayList<String> list1 = new ArrayList<>(list);
		
		// using for loop
		System.out.println("Iteration using for loop");
		for(int i=0; i< list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// using enhanced for loop
		System.out.println("Iteration using enhanced for loop");
		for(String s : list1) {
			System.out.println(s);
		}
		
		// using iterator
		System.out.println("Iteration using iterator");
		Iterator<String> it = list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// using list iterator
		System.out.println("Iteration using List Iterator ");
		ListIterator<String> listIt = list1.listIterator();
		
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
	
	}
}