import java.util.*;

public class ArrayListSubListOperation {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("A", "B", "C", "D", "E", "F", "G");
		List<String> sub = list.subList(1, 3);
		
		System.out.println(list);
		System.out.println(sub);
	}
}