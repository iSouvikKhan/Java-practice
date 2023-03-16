package InnerClasses;

public class IC_1 {
	public static void main(String[] args) {
		Outer.main();
	}
}

class Outer{
	class Inner{
		public void m1() {
			System.out.println("inner m1");
		}
	}
	
	public static void main() {
		System.out.println("main method outer class");
		new Outer().new Inner().m1();
		// from static area of outer class we r accessing instance area of inner class
	}
}