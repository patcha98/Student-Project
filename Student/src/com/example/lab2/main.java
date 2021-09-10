package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.lab2.Student;
import com.example.lab2.Fruit;



public class main {
	public static void main(String args[]){
		
		List<Student> al = new ArrayList<Student>();
		System.out.println("�л� ����Ʈ�� �̸����� �����մϴ�.");

		al.add(new Student(1, "��â��", 21));
		al.add(new Student(2, "���Ƽ�", 22));
		Student s3 = new Student(2, "�輺��", 21);
		al.add(s3);
		Student s4 = new Student(4, "�̳���", 24);
		al.add(s4);
		Student s5 = new Student(5, "�ż���", 23);
		al.add(s5);
		Student s6 = new Student(6, "������", 28);
		al.add(s6);
		Student s7 = new Student(7, "���ֿ�", 25);
		al.add(s7);
		Student s8 = new Student(8, "�ѹٴ�", 24);
		al.add(s8);
		Student s9= new Student(9, "�̾Ƹ�", 21);
		al.add(s9);
		Student s10 = new Student(10, "�ȵ���", 21);
		al.add(s10);
		
		Collections.sort(al, new StudentNameComparator());
		
		for(Student s : al) {
			System.out.println(s.name.toString());
		}
		System.out.println("�л� ����Ʈ�� �̸� ������ �����Ǿ����ϴ�.");
		
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("���� ����Ʈ�� �̸����� �����մϴ�.");
		fl.add(new Fruit(1, "�ٳ���", 2100));
		fl.add(new Fruit(2, "���", 1100));
		fl.add(new Fruit(3, "��", 3500));
		fl.add(new Fruit(4, "����", 4800));
		fl.add(new Fruit(5, "����", 15500));
		fl.add(new Fruit(6, "����", 8400));
		fl.add(new Fruit(7, "Ű��", 4500));
		fl.add(new Fruit(8, "������", 8400));
		fl.add(new Fruit(9, "����", 6500));
		fl.add(new Fruit(10, "���ξ���", 7700));
		Collections.sort(fl, new FruitNameComparator());
		
		for(Fruit f : fl) {
			System.out.println(f.name.toString());
		}
		System.out.println("���� ����Ʈ�� �̸� ������ �����Ǿ����ϴ�.");
		
		
	}
	
}