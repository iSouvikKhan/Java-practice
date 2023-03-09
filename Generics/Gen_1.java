package Generics;

import java.util.*;

public class Gen_1 {
	public static void main(String[] args) {		
		List<Integer> al = Arrays.asList(5,8,3,1); // asList returns a List
		
		Collections.sort(al);
		
		System.out.println(al);
	}
}
