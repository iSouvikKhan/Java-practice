package Stream;

import java.util.Arrays;
import java.util.List;

public class Str_4 {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(2,6,3,9,5,7,4);
		
		int num = al.parallelStream()
				.filter(n -> n%2==0)
				.map(n -> n*2)
				.reduce(0, (a,b) -> a+b);
		
		System.out.println(num);
	}
}
