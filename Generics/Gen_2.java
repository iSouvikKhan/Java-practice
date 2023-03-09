package Generics;

import java.util.*;

public class Gen_2 {
	public static void main(String[] args) {
		List<Student> al = Arrays.asList(
				new Student(22,"Souvik"),
				new Student(66,"Samir"),
				new Student(11,"Nripendranath")
				);
		
		Collections.sort(al);
		
		System.out.println(al);
	}
}

class Student
{
	private int age;
	private String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + " " + name;
	}
	// try with commenting toString method 
	
}