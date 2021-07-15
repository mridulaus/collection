package com.xworkz.listtask.tester;
import java.util.*;
public class ColoursTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> colorlist = new ArrayList<String>();

		    // use add() method to add values in the list
		    colorlist.add("White");
		    colorlist.add("Black");
			colorlist.add("Red");
		   
		 
			ArrayList<String> sample = new ArrayList<String>();
			
		   // use add() method to add values in the list 
		    sample.add("Green"); 
			sample.add("Red"); 
			sample.add("White");
			
		   // remove all elements from sample list if it exists in colorlist
			sample.removeAll(colorlist);
			
		    System.out.println("First List :"+ colorlist);
			System.out.println("Second List :"+ sample);

		  }
		
		

	}


