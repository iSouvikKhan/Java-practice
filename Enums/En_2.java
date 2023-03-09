package Enums;

enum Days{
	
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
	
	int num;
	
	Days(){
		System.out.println("Printing Days");
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
	
}


public class En_2 {
	public static void main(String[] args) {
		Days.MONDAY.setNum(2);
		System.out.println(Days.MONDAY.getNum());
		System.out.println("-----------");
		System.out.println(Days.THURSDAY);
	}
}
