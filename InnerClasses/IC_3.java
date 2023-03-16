package InnerClasses;

public class IC_3 {
	public static void main(String[] args) {
		new Outer3().new Inner3().m1();
		// accessing instance area of inner class from one more class
	}
}

class Outer3{
	class Inner3{
		public void m1() {
			System.out.println("inner m1");
		}
	}
}