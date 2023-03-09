package Enums;

enum WeekDays{
	
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
	
}

public class En_3 {
	public static void main(String[] args) {
		WeekDays wd = WeekDays.MONDAY;
		
		switch(wd)
		{
		case MONDAY:
			System.out.println("Monday printed");
			break;
		default:
			System.out.println("bhai aage barh lee");
		}
	}
}
