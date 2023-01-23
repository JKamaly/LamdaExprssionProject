package functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employe{
	String ename;
	int salary;
	
	Employe(String ename, int salary){
		this.ename = ename;
		this.salary = salary;
	}
}
class Demo4{
	
	public static void main(String[] args) {
		
		ArrayList<Employe> empl = new ArrayList<Employe>();
		empl.add(new Employe ("Scott", 20000));
		empl.add(new Employe ("James", 30000));
		empl.add(new Employe ("John", 40000));
		empl.add(new Employe ("Mike", 50000));
		
		Function<Employe, Integer> fn =e->{
			                        int sal = e.salary;
			                        if(sal>=10000&&sal<=20000)
			                        	return sal*10/100;
			                        else if(sal>=20000&&sal<=30000)
			                        	return sal*20/100;
			                        else if (sal>=30000&&sal<=40000)
			                        	return sal*30/100;
			                        else if (sal>=40000&&sal<=50000)
			                        	return sal*40/100;
			                        else
			                        	return sal*10/100;
			
		};
		Predicate<Integer> p = n->n>5000;
		
		for(Employe em:empl) {
			int bonus = fn.apply(em);
			if(p.test(bonus)) {
				System.out.println(em.ename+"  "+em.salary);
				System.out.println("Bonus is: "+ bonus);
				
			}
		}
	
		

	}

}
