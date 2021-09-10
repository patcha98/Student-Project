package com.example.lab2;

import java.util.Comparator;

public class Student {
	int no;
	String name;
	int age;
	
	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	

	
}


class StudentNameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}

class StudentNameComparatorDesc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}

}

