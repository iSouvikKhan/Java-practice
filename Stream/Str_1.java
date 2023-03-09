package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Str_1 {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(2,6,3,9,5,7,4);
		
		Stream<Integer> stream = al.stream();
		
		stream.forEach(n -> System.out.println(n));
		
		stream.forEach(n -> System.out.println(n)); // same Stream cannot be used twice
	}
}
