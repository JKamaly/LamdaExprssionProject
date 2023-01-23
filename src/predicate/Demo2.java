package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	int experience;

	Employee(String name, int sal, int exp) {
		ename = name;
		salary = sal;
		experience = exp;
	}

}

public class Demo2 {

	public static void main(String[] args) {

		// lambda expression - emp obj ---> return name if sal>30k, exp>3

		Employee emp = new Employee("James", 50000, 5);

		Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience > 3);
		// System.out.println(pr.test(emp));

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Scott", 40000, 4));
		al.add(new Employee("Jack", 30000, 3));
		al.add(new Employee("Mary", 50000, 5));
		al.add(new Employee("Anna", 20000, 2));
		al.add(new Employee("David", 35000, 3));
		al.add(new Employee("Michle", 310000, 4));
		al.add(new Employee("Gary", 420000, 5));

		for (Employee e : al) {
			if (pr.test(e)) {
				System.out.println(e.ename + "  " + e.salary + "  " + e.experience);

			}
		}

	}

}
