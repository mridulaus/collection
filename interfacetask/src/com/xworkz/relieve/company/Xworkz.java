package com.xworkz.relieve.company;
import com.xworkz.relieve.rules.*;
public class Xworkz {
	
	private RelievbleRule rule;
	
	public Xworkz() {
		System.out.println("created xworkz");
	}
	public void employeeExit() {
		if(rule != null) {
			System.out.println("rules exist can check and exit");
			boolean complete = this.rule.completedBond();
			int period = this.rule.servedNoticePeriod();
			
			if(complete && period >= RelievbleRule.NOTICE_PERIOD_DAYS ) {
			System.out.println("emplyoee can exit now");	
			}else {
			System.out.println("emplyoee can't exit,as rules are not followed");	
			}
		}else {
			System.out.println("rules not exist , can't exit");
		}
	}
	public void setRule(RelievbleRule rule) {
		this.rule = rule;
	}

}
