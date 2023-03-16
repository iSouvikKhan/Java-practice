package Enums;

import java.util.Arrays;

enum Result{
	PASS, FAIL, NA;
}

public class En_1 {
	
	enum Gender{
		MALE, EEMALE, OTHERS;
	}
	
	public static void main(String[] args) {
		
		Result r = Result.PASS;
		System.out.println(r);
		
		System.out.println(Gender.MALE);
		
		System.out.println(Gender.MALE.ordinal()); // 0
		
		Result[] arr = Result.PASS.values();
		
		for(Result re : arr) {
			System.out.println(re + " " + re.ordinal());
		}
		
	}
}
