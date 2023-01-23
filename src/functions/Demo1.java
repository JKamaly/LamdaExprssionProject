package functions;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
	
		Function<Integer, Integer> f=n->n*n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(8));
		
		//String length
		
		//String --> lenght --> int 
		
		String str = "I need to count the length of this string";
		Function<String, Integer> fn = s->s.length();
		
		System.out.println(fn.apply(str));
	}

}
