package com.mridula.grouping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActorTester {

	public static void main(String[] args) {
		String actor1 = " Salman Khan";
		String actor2 = " Dulquer Salman";
		String actor3 = " Sharukh khan";
		String actor4 = " Allu Arjun";
		String actor5 = " Ajay  Devgan";
		String actor6 = "Ram Charan ";
		String actor7 = "Sushanth";
		String actor8 = " Darshan";

		Collection collection = new ArrayList(10);
		boolean added = false;
		added = collection.add(actor1);
		added = collection.add(actor2);
		added = collection.add(actor3);
		added = collection.add(actor4);
		added = collection.add(actor5);

		added = collection.add("Rakshit shetty");
		added = collection.add("sudeep");

		added = collection.add(actor6);
		added = collection.add(actor7);
		added = collection.add(actor8);

		System.out.println(added);
		System.out.println(collection);

		int total = collection.size();
		System.out.println("total no " + total);

		String check = "sachin";
		boolean contain = collection.contains(check);
		System.out.println("contain check " + contain);

		System.out.println("removed actor3 " + collection.remove(actor3));
		boolean removed = collection.remove("Allu Arjun");
		System.out.println("removed Allu Arjun " + removed);

		Iterator iterator = collection.iterator();

		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		// System.out.println(iterator.next());

		System.out.println(collection);
		collection.clear();
		System.out.println(collection);
		System.out.println("size " + collection.size());

	}

}
