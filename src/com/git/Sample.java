package com.git;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Sample {

	public void listExample() {
		List<String> li = new ArrayList<String>();

		li.add("benz");
		li.add("bmw");
		li.add("skoda");
		li.add("jaguar");
		li.add("audi");
		System.out.println(li + "\n");

		System.out.println("\t" + "getparticular:-" + "\n" + li.get(3) + "\n");

		List<String> l2 = new ArrayList<String>();
		l2.addAll(li);
		System.out.println("\t" + "addAll:-" + "\n" + l2 + "\n");

		l2.set(3, "maruthi");
		System.out.println("\t" + "set:-" + "\n" + l2 + "\n");

		System.out.println("\t" + "forloop:-");

		for (int i = 0; i < li.size(); i++) {
			System.out.println("\t" + li.get(i));
		}
		System.out.println("\n" + "\t" + "forEach loop:-");

		for (String l3 : l2) {
			System.out.println("\t" + l3);
		}
		ListIterator<String> iterator = li.listIterator();

		System.out.println("\n" + "\t" + "hasNext:-");
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());
		}

		System.out.println("\n" + "\t" + "hasPrevious:-");
		while (iterator.hasPrevious()) {
			System.out.println("\t" + iterator.previous());
		}

		System.out.println("iterator:-");
		Iterator<String> iterator2 = li.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		List<String> l3 = new ArrayList<String>();
		l3.addAll(li);
		System.out.println(l3);
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.listExample();
	}
}
