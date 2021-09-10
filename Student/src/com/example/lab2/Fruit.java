package com.example.lab2;

import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int cost;
	
	public Fruit(int no, String name, int cost) {
		super();
		this.no = no;
		this.name = name;
		this.cost = cost;
	}
}

class FruitNameComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}

class FruitNameComparatorDesc implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}

}


