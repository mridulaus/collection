package com.mridula.grouping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PalaceTester {

	public static void main(String[] args) {

		String palace1 = " Anand Bag Palace, Bihar";
		String palace2 = "al Mahal , Rajastan";
		String palace3 = "Gorbandh Palace, Jaisalmer";
		String palace4 = "Jai Vilas Mahal Gwalior";
		String palace5 = "Leh Palace, Ladhakh";
		String palace6 = "Shaukat Mahal Bhopal";
		String palace7 = " ang Mahal-Junagadh";
		String palace8 = " Mysore Aramane,Mysore";
		String palace9 = "Halcyon Castle ,Kerala";
		String palace10 = "Bhutan House,WB";
		Collection collection = new ArrayList(10);
		boolean added = false;
		added = collection.add(palace5);
		added = collection.add(palace10);
		added = collection.add(palace8);
		added = collection.add(" Thevally Palace, Kollam ");
		added = collection.add(palace6);
		added = collection.add(palace4);
		added = collection.add(palace1);
		added = collection.add(palace7);
		System.out.println(added);
		System.out.println(collection);

		int total = collection.size();
		System.out.println("total no " + total);

		String check = " ang Mahal-Junagadh";
		boolean contain = collection.contains(check);
		System.out.println("contain check " + contain);

		System.out.println("removed palace1 " + collection.remove(palace1));
		boolean removed = collection.remove("Jai Vilas Mahal Gwalior");
		System.out.println("removed Jai Vilas Mahal Gwalior " + removed);

		Iterator iterator = collection.iterator();
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());

		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());

		System.out.println(iterator.hasNext()); 
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());

		System.out.println(collection);
		collection.clear();
		System.out.println(collection);
		System.out.println("size " + collection.size());

	}

}
