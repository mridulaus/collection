package com.mradula.grouptask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryCollectionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String india = "india";
		String southKorea = "southkorea";
		String japan = "japan";
		String greece = "greece";
		String srilanka = "srilanka";
		String finland = "finland";
		Collection<String> collect = new ArrayList<String>();
		collect.add(india);
		collect.add(southKorea);
		collect.add(japan);
		collect.add(greece);
		collect.add(srilanka);
		collect.add("chile");
		collect.add(finland);
		System.out.println(collect);
		System.out.println(collect.size());
		Iterator<String> itr = collect.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();

			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str.toUpperCase());
			}
		}

	}

}
