package com.xworkz.dtotask.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.dtotask.constants.ChocolatesType;
import com.xworkz.dtotask.tele.ChocolateDTO;

public class ChocoDtoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChocolateDTO choco1 = new ChocolateDTO("Michele Ferrero", "CoCo butter", 558, true,
				ChocolatesType.FERRERO_ROCHER, true, "Europe");
		ChocolateDTO choco2 = new ChocolateDTO("Michele Ferrero", "CoCo butter", 558, true, ChocolatesType.KINDER_BUENO,
				true, "Europe");
		ChocolateDTO choco3 = new ChocolateDTO("Forrest Mars Sr.and Mars com", "CoCo butter", 225, true,
				ChocolatesType.TWIX, true, "UK");

		Collection<ChocolateDTO> collection = new ArrayList<ChocolateDTO>();

		collection.add(choco1);
		collection.add(choco2);
		collection.add(choco3);

		Iterator<ChocolateDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			ChocolateDTO refDTO = itr.next();
			System.out.println(refDTO);
			if (refDTO.getPrice() > 500) {
				System.out.println("chocolate price is high");
			} else {
				System.out.println("less price");
			}
		}

		ChocolateDTO choco4 = new ChocolateDTO("Emil Baumann & Theodor Tobler ", "CoCo butter", 558, true,
				ChocolatesType.TOBLERONE, true, "UK");

		boolean contain = collection.contains(choco4);
		System.out.println(contain);
	}

}
