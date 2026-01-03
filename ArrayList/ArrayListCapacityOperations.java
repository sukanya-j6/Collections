import java.util.*;

public class ArrayListCapacityOperations {
	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<>(100);
		int size = list.size();
		System.out.println(size);
		
		list.ensureCapacity(200);
		size = list.size();
		System.out.println(size);
		
		// list.trimToSize();
		
	}
}