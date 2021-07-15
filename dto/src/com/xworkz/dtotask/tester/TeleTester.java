package com.xworkz.dtotask.tester;
import com.xworkz.dtotask.tele.*;
public class TeleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelivisionDTO teleDto = new TelivisionDTO();
		teleDto.setBrand("MI");
		teleDto.setNoOfPorts(4);
		teleDto.setPrice(30000);
		teleDto.setSmart(true);
		System.out.println(teleDto.toString());
		
	}

}

