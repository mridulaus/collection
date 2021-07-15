package com.mradula.grouptask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class EmployeeCollectionTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String emp1  = "mridula";
String emp2 = "mrinal";
String emp3 = "uday";
String emp4 = "pushpa";
String emp5 = "darshan";
String emp6= "priti";
 Collection<String> collect = new ArrayList<String>();
 collect.add(emp1);
 collect.add(emp2);
 collect.add("rahul");
 collect.add(emp3);
 collect.add(emp4);
 collect.add(emp5);
 collect.add("priyanka");
 collect.add(emp6);
 System.out.println(collect);
System.out.println(collect.size());	
Iterator<String> itr = collect.iterator();
while (itr.hasNext()) {
	Object obj = itr.next();
	 if( obj instanceof String ) {
		 String str = (String)obj;
		 System.out.println(str.toUpperCase());
	 }
	}

	}
}
