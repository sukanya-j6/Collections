import java.util.*;

public class ArrayListCloneOperations {
	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<>(100);		
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		try {
			@SuppressWarnings("unchecked")
			ArrayList<Integer> cloned = (ArrayList<Integer>) list.clone();
			System.out.println(cloned);
			
			List<Integer> list2 = new ArrayList<>(list);
			System.out.println(list2);

		} catch(Exception e) {
			
		}
	}
}