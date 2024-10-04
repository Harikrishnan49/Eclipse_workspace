package org.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample{

	public void array() {
		List<String> arrayList = (List<String>) new ArrayList();
		arrayList.add("Hari");
		arrayList.add("Poo");
		arrayList.add("Gokul");
		arrayList.add("Ravi");
		arrayList.add("Sara");
		System.out.println(arrayList);
		System.out.println(arrayList.get(4));
		System.out.println(arrayList.indexOf("Ravi"));
		System.out.println(arrayList.lastIndexOf("Sara"));
		List<String> arrayList1 = (List<String>) new ArrayList();
		arrayList1.addAll(arrayList);
		System.out.println(arrayList1);
		arrayList1.clear();
		System.out.println(arrayList1);
		arrayList.remove(0);
		System.out.println(arrayList);
		for (String string : arrayList) {
			System.out.println(string);
		}
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		ListIterator<String> iterator = arrayList.listIterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		while (iterator.hasPrevious()) {
			String string1 = (String) iterator.previous();
			System.out.println(string1);
		}
	}
	public static void main (String[] args) {
		ArrayListExample array = new ArrayListExample();
		array.array();

	}
}
