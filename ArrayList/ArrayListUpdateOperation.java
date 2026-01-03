import java.util.*;

public class ArrayListUpdateOperation {
	
	public static void main(String args[]) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("JAVA");
		list1.add("Angular");
		
		System.out.println(list1);		
		list1.set(1, "SpringBoot");		
		System.out.println(list1);
		
	}
}