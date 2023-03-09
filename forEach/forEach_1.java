package forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEach_1 {
	public static void main(String[] args) {
		
		List<Integer> al = Arrays.asList(2,3,4,5,6,7);
		al.forEach(n -> System.out.println(n));
		
		System.out.println("-----------");
		
		Consumer<Integer> con = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		al.forEach(con);
		
		System.out.println("-----------");
		
		Consumer<Integer> conn =(t) -> System.out.println(t);
		al.forEach(conn);
		
		System.out.println("-----------");
		
		// (t) -> System.out.println(t) --> cut this part and paste in forEach loop
	}
}
