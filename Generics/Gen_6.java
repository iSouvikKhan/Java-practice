package Generics;

import java.util.*;


public class Gen_6 {
	public static void main(String[] args) {
		List<Student5> al = Arrays.asList(
				new Student5(22,"Souvik"),
				new Student5(66,"Samir"),
				new Student5(11,"Nripendranath")
				);
		
		Collections.sort(al, (s1, s2) -> s1.age - s2.age);
		// this method will get the subtracted integer value
		// if value is +ve swapping will happen otherwise it will not
		
		System.out.println(al);
		
	}
}

//class ImplementationClass3 implements Comparator<Student5>{
//
//	@Override
//	public int compare(Student5 s1, Student5 s2) {
//		return s1.age - s2.age;
//	}
//	
//}


// suppose u don't have the source code of the 'Student4' class
class Student5 implements Comparable<Student5>{
	public int age;
	public String name;
	
	public Student5(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + " " + name;
	}
	// try with commenting toString method 

	@Override
	public int compareTo(Student5 that) {
	//	return this.age-that.age; // sorting in ascending order
	//	return that.age-this.age; // sorting in descending order
	//	return this.name.compareTo(that.name); // sorting in ascending order
	//	return that.name.compareTo(this.name); // sorting in descending order
		return this.name.length() - that.name.length(); // sorting in ascending order
	}
	
}