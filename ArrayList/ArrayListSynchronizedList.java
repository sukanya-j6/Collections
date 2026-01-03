import java.util.*;

public class ArrayListSynchronizedList {
	public static void main(String []args) {
		
		ArrayList<String> list = List.of("A", "B", "C", "D");
		List<String> list1 = Collections.synchronizedList(new ArrayList<>()); // ❌ Not thread-safe by default
	}
}