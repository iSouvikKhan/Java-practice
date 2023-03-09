package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gen_5 {
	public static void main(String[] args) {
		List<Student4> al = Arrays.asList(
				new Student4(22,"Souvik"),
				new Student4(66,"Samir"),
				new Student4(11,"Nripendranath")
				);
		
		// Comparator is a functional interface so Lambda expression
		Comparator<Student4> com = (s1, s2) -> s1.age - s2.age;
		
		Collections.sort(al, com);
		// this method will get the subtracted integer value
		// if value is +ve swapping will happen otherwise it will not
		
		System.out.println(al);
		
	}
}

//class ImplementationClass2 implements Comparator<Student4>{
//
//	@Override
//	public int compare(Student4 s1, Student4 s2) {
//		return s1.age - s2.age;
//	}
//	
//}


// suppose u don't have the source code of the 'Student4' class
class Student4 implements Comparable<Student4>{
	public int age;
	public String name;
	
	public Student4(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + " " + name;
	}
	// try with commenting toString method 

	@Override
	public int compareTo(Student4 that) {
	//	return this.age-that.age; // sorting in ascending order
	//	return that.age-this.age; // sorting in descending order
	//	return this.name.compareTo(that.name); // sorting in ascending order
	//	return that.name.compareTo(this.name); // sorting in descending order
		return this.name.length() - that.name.length(); // sorting in ascending order
	}
	
}