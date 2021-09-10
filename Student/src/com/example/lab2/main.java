package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.lab2.Student;
import com.example.lab2.Fruit;



public class main {
	public static void main(String args[]){
		
		List<Student> al = new ArrayList<Student>();
		System.out.println("학생 리스트를 이름으로 정렬합니다.");

		al.add(new Student(1, "안창현", 21));
		al.add(new Student(2, "박훈성", 22));
		Student s3 = new Student(2, "김성현", 21);
		al.add(s3);
		Student s4 = new Student(4, "이나연", 24);
		al.add(s4);
		Student s5 = new Student(5, "신선미", 23);
		al.add(s5);
		Student s6 = new Student(6, "강동민", 28);
		al.add(s6);
		Student s7 = new Student(7, "이주연", 25);
		al.add(s7);
		Student s8 = new Student(8, "한바다", 24);
		al.add(s8);
		Student s9= new Student(9, "이아름", 21);
		al.add(s9);
		Student s10 = new Student(10, "안도연", 21);
		al.add(s10);
		
		Collections.sort(al, new StudentNameComparator());
		
		for(Student s : al) {
			System.out.println(s.name.toString());
		}
		System.out.println("학생 리스트가 이름 순으로 나열되었습니다.");
		
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("과일 리스트를 이름으로 정렬합니다.");
		fl.add(new Fruit(1, "바나나", 2100));
		fl.add(new Fruit(2, "사과", 1100));
		fl.add(new Fruit(3, "배", 3500));
		fl.add(new Fruit(4, "딸기", 4800));
		fl.add(new Fruit(5, "수박", 15500));
		fl.add(new Fruit(6, "참외", 8400));
		fl.add(new Fruit(7, "키위", 4500));
		fl.add(new Fruit(8, "복숭아", 8400));
		fl.add(new Fruit(9, "포도", 6500));
		fl.add(new Fruit(10, "파인애플", 7700));
		Collections.sort(fl, new FruitNameComparator());
		
		for(Fruit f : fl) {
			System.out.println(f.name.toString());
		}
		System.out.println("과일 리스트가 이름 순으로 나열되었습니다.");
		
		
	}
	
}