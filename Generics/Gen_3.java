package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gen_3 {
	public static void main(String[] args) {
		List<Student2> al = Arrays.asList(
				new Student2(22,"Souvik"),
				new Student2(66,"Samir"),
				new Student2(11,"Nripendranath")
				);
		
		Collections.sort(al);
		// this method will get the subtracted integer value
		// if value is +ve swapping will happen otherwise it will not
		
		System.out.println(al);
		
	}
}

class Student2 implements Comparable<Student2>
{
	private int age;
	private String name;
	
	public Student2(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + " " + name;
	}
	// try with commenting toString method 

	@Override
	public int compareTo(Student2 that) {
	//	return this.age-that.age; // sorting in ascending order
	//	return that.age-this.age; // sorting in descending order
	//	return this.name.compareTo(that.name); // sorting in ascending order
	//	return that.name.compareTo(this.name); // sorting in descending order
		return this.name.length() - that.name.length(); // sorting in ascending order
	}
	
}