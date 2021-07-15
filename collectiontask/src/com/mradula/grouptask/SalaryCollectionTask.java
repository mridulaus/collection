package com.mradula.grouptask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SalaryCollectionTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int developerSal = 40000;
		int testerSal = 18000;
		int managerSal = 85000;
		int ceoSal = 180000;
		int fresherSal = 9000;
		int teamLeadSal = 50000;

		Collection<Integer> collection = new ArrayList<>();

		collection.add(developerSal);
		collection.add(teamLeadSal);
		collection.add(managerSal);
		collection.add(testerSal);
		collection.add(ceoSal);
		collection.add(fresherSal);
		System.out.println(collection);

		Iterator<Integer> itr = collection.iterator(); // wrapper class of int is Integer

		while (itr.hasNext()) {
			// Object ref = itr.next();
			// if( ref instanceof Integer ) {
			Integer salary = itr.next(); // down casting @@ Integer is a wrapper class(not need  downcasting if it is generic)
//dc not needed bcz its generic
			if (salary <= 50000) {
				System.out.println("  Not bad   ...!!! it's a good salary though...");
				System.out.println(salary);
			}
			if (salary < 10000) {
				System.out.println(" need to improve the skilss  ");
				System.out.println(salary);
			}
			if (salary > 50000) {
				System.out.println(" Excellent..!!");
				System.out.println(salary);
			}

			// else if(salary >= 50000) {
			// System.out.println(" great salary ");
			// }
			// else if(salary <= 10000) {
			// System.out.println(" need to improve the skilss ");
			// }

			// else{
			// System.out.println("invalid");
			// }

			// }
		}

	}

}
