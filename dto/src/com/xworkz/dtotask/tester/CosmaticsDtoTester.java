package com.xworkz.dtotask.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.xworkz.dtotask.constants.*;
import com.xworkz.dtotask.tele.*;
public class CosmaticsDtoTester {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CosmaticsDTO cosmatic1 = new CosmaticsDTO(CosmaticsType.LIPSTICK ,true , "MAC", true,4583.4d,true,56.3d );
		CosmaticsDTO cosmatic2 = new CosmaticsDTO(CosmaticsType.EYE_SHADOW ,true , "MAC", true,4583.4d,true,35.8d );
		CosmaticsDTO cosmatic3 = new CosmaticsDTO(CosmaticsType.MASCARA ,true , "COLOR_BAR", true,3583.4d,true,85.3d );
		
		Collection<CosmaticsDTO> collect = new ArrayList<CosmaticsDTO>(); //object creation of arraylist
		collect.add(cosmatic1);
		collect.add(cosmatic2);
		collect.add(cosmatic3);
		
		Iterator<CosmaticsDTO> itr = collect.iterator();
		while(itr.hasNext()) {
			CosmaticsDTO refDTO	= itr.next();
			System.out.println(refDTO);
			if(refDTO.getPrice() > 3000) {
				System.out.println("costly   :-" + refDTO.getBrands() + "  " + refDTO.getPrice());
			}else {
				System.out.println(" reasonable  :-" + refDTO.getBrands() +  "   " + refDTO.getPrice());	
			}
			
			
		}
		
		CosmaticsDTO cosmatic4 = new CosmaticsDTO(CosmaticsType.PRIMER ,true , "COLOR_BAR", true,3583.4d,true,86.3d );
		boolean contain = collect.contains(cosmatic4);
		System.out.println(contain);
		
	}

}
