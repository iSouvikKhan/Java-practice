package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Str_2 {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(2,6,3,9,5,7,4);
		
		System.out.println(al);
		
		Stream<Integer> s1 = al.stream();
		
		System.out.println("--------------------------------------");
		
//		Predicate<Integer> pr = new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				if(t%2 == 0) {
//					return true;
//				}
//				return false;
//			}
//		};
//		
//		Stream<Integer> s2 = s1.filter(pr); // s1 is being used here
//		
//		s2.forEach(n -> System.out.println(n)); // s2 is being used here
		
		System.out.println("--------------------------------------");
		
//		Predicate<Integer> pr = (t) -> {
//			if(t%2 == 0) {
//				return true;
//			}
//			return false;
//		};
//		
//		Stream<Integer> s2 = s1.filter(pr); // s1 is being used here
//		
//		s2.forEach(n -> System.out.println(n)); // s2 is being used here
		
		System.out.println("--------------------------------------");
		
//		Predicate<Integer> pr = (t) -> t%2 == 0; // "== 0" or "==1" it is your choice
//		
//		Stream<Integer> s2 = s1.filter(pr); // s1 is being used here
//		
//		s2.forEach(n -> System.out.println(n)); // s2 is being used here
		
		System.out.println("--------------------------------------");
				
//		Stream<Integer> s2 = s1.filter(t -> t%2 == 0); // filter takes Predicate interface
//		
//		Stream<Integer> s3 = s2.map(n -> n*2); // map takes Function interface. it has 2 generic types, getting and returning type
//		
//		BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				return t+u;
//			}
//		};
//		
//		System.out.println(s3.reduce(0, bi));
				
		System.out.println("--------------------------------------");
		
//		Stream<Integer> s2 = s1.filter(t -> t%2 == 0); // filter takes Predicate interface
//		
//		Stream<Integer> s3 = s2.map(n -> n*2); // map takes Function interface. it has 2 generic types, getting and returning type
//		
//		BinaryOperator<Integer> bi = (t, u) -> t+u;
//		
//		System.out.println(s3.reduce(0, bi));
				
		System.out.println("--------------------------------------");
		
		Stream<Integer> s2 = s1.filter(t -> t%2 == 0); // filter takes Predicate interface
		
		Stream<Integer> s3 = s2.map(n -> n*2); // map takes Function interface. it has 2 generic types, getting and returning type
				
		int num = s3.reduce(0, (t, u) -> t+u); // BinaryOperator and BiFunction both are functional interface
		
		System.out.println(num);
				
		System.out.println("--------------------------------------");
		
	}
}
