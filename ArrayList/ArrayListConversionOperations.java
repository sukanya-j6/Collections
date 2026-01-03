import java.util.*;

public class ArrayListConversionOperations {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("JAVA");
		list1.add("Angular");
		System.out.println(list1);
				
		// ArrayList to Array
		String[] arr=list1.toArray(new String[0]);
		
		for(String s : arr) {
			System.out.println(s); 
		}
		
		// Array to ArrayList
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(array));
		
		System.out.println(list2);
	}
}