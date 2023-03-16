package InnerClasses;

public class IC_4 {
	public static void main(String[] args) {
		new Outer4().new Inner4().m1();
	}
}

class Outer4{
	
	int a = 2;
	static int b = 4;
	
	class Inner4{
		
		int c = 6;
		static int d = 7;
		
		public void m1() {
			
			int e = 8;
			final int f = 9;
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
		}
	}
}