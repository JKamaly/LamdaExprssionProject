package predicate;

import java.util.function.Predicate;

// Predeciate --> one parameter returns boolean 
//use only if you have conditional checks in your program...

public class Demo1 {
	

	public static void main(String[] args) {
		
	    //Example1 
		Predicate<Integer> p = i->(i>10);
		
		System.out.println(p.test(20));//true 
		System.out.println(p.test(5));
		
		//Ex2 : check the length of givin string is greater than 4 or not 
		Predicate<String> pr =s->(s.length()>4);
		System.out.println(pr.test("Welcome"));//true
		System.out.println(pr.test("xyz"));//false
		
		//Ex3: print array elemetns whose size is > 4 from array 
		String name []= {"David","John","Smith","Mary"};
		
		for(String n:name) {
			if(pr.test(n)) {
				System.out.println(n);
			}
			
			/*for(String na:name) {
				if(na.length()>4) {
					System.out.println(na);
				}
				
			}*/
		}

	}

}
