import java.util.*;

public class ArrayListRemoveOperations {
	public static void main(String args[]) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("JAVA");
		list1.add("Angular");
		list1.add("SpringBoot");
		list1.add("Microservices");
		list1.add("TypeScript");
		list1.add("JavaScript");
		list1.add("HTML");
		list1.add("AngularJS");
		list1.add("RxJS");
		
		System.out.println(list1);
		
		// remove by index
		list1.remove(7);
		System.out.println("removed by index 7:- " + list1);
		
		// remove by object
		list1.remove("HTML");
		System.out.println("removed object HTML " + list1);
		
		// remove multiple
		list1.remove(" removed multiple list Angular and RxJS :- " + List.of("Angular","RxJS"));
		
		// conditional remove
		list1.removeIf(s -> s.contains("Script"));
		System.out.println("conditional remove that contains script " + list1);
		
		// clear all
		list1.clear();
		System.out.println("clear clears All" + list1);
		
	}
}