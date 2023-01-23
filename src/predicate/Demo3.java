package predicate;

import java.util.function.Predicate;

//Joining predicates - and, or, negate 
// p1 -- checks number is even  
//p2 -- checks greater than 50 or not

public class Demo3 {

	public static void main(String[] args) {
		
		int a[] = {20,15,20,30,35,40,45,50,55,60,65};
		
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>50;
		
		//and
		
		System.out.println("Following are numbers Even and Greater than 50....");
		
		for(int n:a) {
			//if(p1.test(n)&& p2.test(n)) {
			if(p1.and(p2).test(n)) {
				System.out.println(n);
			}
		}
		
		//or 
		System.out.println("Following are numbers Even and Greater than 50 using or....");
		for(int n:a) {
			//if(p1.test(n)&& p2.test(n)) {
			if(p1.or(p2).test(n)) {
				System.out.println(n);
			}
		}
		//negate
		System.out.println("Following are numbers Even and Greater than 50 using negate....");
		for(int n:a) {
			if(p1.negate().test(n)) {
				System.out.println(n);
			}
		}
		
		

	}

}
