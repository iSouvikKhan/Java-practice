package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gen_4 {
	public static void main(String[] args) {
		List<Student3> al = Arrays.asList(
				new Student3(22,"Souvik"),
				new Student3(66,"Samir"),
				new Student3(11,"Nripendranath")
				);
		
		Comparator<Student3> com = new ImplementationClass();
		
		Collections.sort(al, com);
		// this method will get the subtracted integer value
		// if value is +ve swapping will happen otherwise it will not
		
		System.out.println(al);
		
	}
}

class ImplementationClass implements Comparator<Student3>{

	@Override
	public int compare(Student3 s1, Student3 s2) {
		return s1.age - s2.age;
	}
	
}


// suppose u don't have the source code of the 'Student3' class

class Student3 implements Comparable<Student3>{
	public int age;
	public String name;
	
	public Student3(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + " " + name;
	}
	// try with commenting toString method 

	@Override
	public int compareTo(Student3 that) {
	//	return this.age-that.age; // sorting in ascending order
	//	return that.age-this.age; // sorting in descending order
	//	return this.name.compareTo(that.name); // sorting in ascending order
	//	return that.name.compareTo(this.name); // sorting in descending order
		return this.name.length() - that.name.length(); // sorting in ascending order
	}
	
}