package com.xworkz.listtask.tester;

import com.xworkz.listtask.main.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class StreetDtoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StreetDTO street1 = new StreetDTO("SultanStreet", 581350, "near mosque", true, "Bhatkal");
		StreetDTO street2 = new StreetDTO("keriDubaiMarket", 581350, " Down Market", true, "Bhatkal");
		StreetDTO street2 = new StreetDTO("ranginkatte", 581350, "  Market", true, "Bhatkal");
		StreetDTO street2 = new StreetDTO("keriDubaiMarket", 581350, " Down Market", true, "Bhatkal");
		List<StreetDTO> list1 = new ArrayList<StreetDTO>();
		
		List<StreetDTO> list2 = new ArrayList<StreetDTO>();


		List<StreetDTO> street3 = new ArrayList<StreetDTO>();
		
		street3.addAll(street1);
		street3.addAll(street2);
		System.out.println(street1);
		System.out.println( "size is  " + street3.size());
		//System.out.println("element in 5th position  "+ street3.get(5));
		//street.add(list2);

		//Iterator<StreetDTO> itr = street.listIterator();
		//while (itr.hasNext()) {
			//StreetDTO refDTO = itr.next();
			//System.out.println(refDTO);

		//}

		// System.out.println(list1);
		// System.out.println( street3.size() );
		// System.out.println( street3.size() );
	}
}