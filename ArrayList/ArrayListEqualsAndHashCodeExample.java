import java.util.*;

public class ArrayListEqualsAndHashCodeExample {
	public static void main(String[] args) {
	
		ArrayList<String> a = new ArrayList<>(List.of("A", "B"));
		ArrayList<String> b = new ArrayList<>(List.of("A", "B"));

		System.out.println(a.equals(b)); // true

	}
}