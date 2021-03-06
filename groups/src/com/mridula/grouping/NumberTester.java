package com.mridula.grouping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NumberTester {

	public static void main(String[] args) {
		long mobileNumber = 9695946885l;
		long mobileNumber2 = 9448560534l;
		long mobileNumber3 = 886117120;
		long mobileNumber4 = 56551269;
		long mobileNumber5 = 9148755841l;
		long mobileNumber6 = 936543210l;

		Collection collection = new ArrayList(6);
		boolean added = false;
		added = collection.add(mobileNumber);
		added = collection.add(mobileNumber2);
		added = collection.add(mobileNumber3);

		added = collection.add(1234567890);
		added = collection.add("9680563215");

		added = collection.add(mobileNumber4);
		added = collection.add(mobileNumber5);
		added = collection.add(mobileNumber6);

		System.out.println(added);
		System.out.println(collection);

		int total = collection.size();
		System.out.println("total no " + total);

		long check = 9148755841l;
		boolean contain = collection.contains(check);
		System.out.println("contain check " + contain);

		System.out.println("removed mobileNumber5 " + collection.remove(mobileNumber));
		boolean removed = collection.remove(56551269);
		System.out.println("removed 56551269" + removed);

		Iterator iterator = collection.iterator();

		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());

		System.out.println(collection);
		collection.clear();
		System.out.println(collection);
		System.out.println("size " + collection.size());

	}

}
