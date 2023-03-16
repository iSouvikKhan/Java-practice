package InnerClasses;

import InnerClasses.Outer4.Inner4;

public class IC_5 {
	public static void main(String[] args) {
		new Outer5().new Inner5().m1();
	}
}

class Outer5{
	
	int a = 2;
	
	class Inner5{
		
		int a = 6;
		
		public void m1() {
			
			int a = 8;
			
			System.out.println(Outer5.this.a);
			System.out.println(this.a);
			System.out.println(a);
		}
	}
}