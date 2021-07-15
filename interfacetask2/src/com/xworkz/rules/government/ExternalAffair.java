package com.xworkz.rules.government;
import com.xworkz.relieve.rules.RelievbleRule;
import com.xworkz.rules.passportrules.*;
public class ExternalAffair {
private PassportRule rule;

public ExternalAffair() {
	System.out.println("created external afair constructor");
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
public void setRule() {
	this.rule = rule;
}


}
