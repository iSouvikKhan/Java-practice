package InnerClasses;

public class IC_2 {
	public static void main(String[] args) {
		Outer2.main();
	}
}

class Outer2{
	class Inner2{
		public void m1() {
			System.out.println("inner m1");
		}
	}
	
	public void m2() {
		System.out.println("outer m2");
		new Inner2().m1();
		// from instance area of outer class we r accessing instance area of inner class
	}
	
	public static void main() {
		System.out.println("main method outer class");
		new Outer2().m2();
	}
}