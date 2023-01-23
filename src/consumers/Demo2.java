package consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	String gender;
	
	Employee(String ename, int salary, String gender){
		this.ename = ename;
		this.salary=salary;
		this.gender=gender;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee ("Jack", 50000, "Male"));
		emplist.add(new Employee ("Scott",60000, "Male"));
		emplist.add(new Employee ("John", 30000, "Male"));
		emplist.add(new Employee ("Anna", 55000, "Female"));
		emplist.add(new Employee ("Mary", 20000, "Female"));
		
		//Function
		Function<Employee, Integer> fn = e->(e.salary*10/100);
		//Predicate
		Predicate<Integer> p = b->b>5000;
		
		//Consumer
		Consumer<Employee> c=e->{
			System.out.println(e.ename);
			System.out.println(e.salary);
			System.out.println(e.gender);
			};
			for(Employee emp:emplist) {
				int bonus = fn.apply(emp);//calculate bonus
				if(p.test(bonus)) {//Invoked predicate
					c.accept(emp);//Invoked consumer
					System.out.println("Bonus is: "+bonus);
				}
			}

	}

}
