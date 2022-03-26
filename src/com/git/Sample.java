package com.git;
import java.util.ArrayList;
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

		System.out.println(li);
		System.out.println(" ");
		System.out.println("getparticular.........");
		System.out.println(li.get(3));

		List<String> l2 = new ArrayList<String>();
		System.out.println(" ");
		System.out.println("addAll..........");
		l2.addAll(li);
		System.out.println(l2);
		System.out.println(" ");
		System.out.println("set...........");
		l2.set(3, "maruthi");
		System.out.println(l2);

		System.out.println(" ");
		System.out.println("forloop...........");

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println(" ");
		System.out.println("forEach loop.........");

		for (String l3 : l2) {
			System.out.println(l3);
		}
		ListIterator<String> iterator = li.listIterator();
		System.out.println(" ");
		System.out.println("hasNext............");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(" ");
		System.out.println("hasPrevious............");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.listExample();
	}
}
