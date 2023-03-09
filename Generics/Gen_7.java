package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gen_7 {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(9,44,6,3,6,7,5,6,42);
		Collections.sort(al, (n1,n2) -> n1-n2); // ascending order
		System.out.println(al);
		
		System.out.println("--------------");
		
		List<Integer> all = Arrays.asList(9,44,6,3,6,7,5,6,42);
		Collections.sort(all, (n1,n2) -> n2-n1); // descending order
		System.out.println(all);
		
		System.out.println("----------");
		
		List<Integer> al3 = Arrays.asList(9,44,6,3,6,7,5,6,42);
		Collections.sort(al3);
		Collections.reverse(al3); // descending order
		System.out.println(al3);
	}
}
