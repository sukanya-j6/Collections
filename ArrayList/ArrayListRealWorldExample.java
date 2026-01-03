import java.util.*;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ArrayListRealWorldExample {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "sukanya"));
		employees.add(new Employee(2, "shamsarali"));

		employees.stream()
		.filter(e -> e.id > 1)
        .forEach(e -> System.out.println(e.name));
	
	}
}