import java.util.*;

public class ArrayListReadOperations {
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("JAVA");
		list1.add("Angular");
		list1.add(1, "SpringBoot");
		
		// 1. retreive element
		String value = list1.get(0);
		
		// 2. Size
		list1.add(1,"Angular");
		int size = list1.size();
		
		
		// 3. check
		boolean isContains = list1.contains("JAVA");
		
		// 4. lookup
		int index = list1.indexOf("Angular");
		int lastIndex = list1.lastIndexOf("Angular");
		
		System.out.println(list1);
		System.out.println("1. retreive element using get(0) :- " + value);
		System.out.println("2. size of list using size() :- " + size);
		System.out.println("3. contains using contains JAVA :- " + isContains);
		System.out.println("4. lookup using indexOf() :- " + index);
		System.out.println("5. lookup last indexof(Angular) using lastIndexOf(Angular) :- " + lastIndex);
	}
}