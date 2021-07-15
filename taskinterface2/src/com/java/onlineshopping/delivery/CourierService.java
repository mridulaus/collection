package com.java.onlineshopping.delivery;
import com.java.onlineshopping.apptester.*;

public class CourierService  implements ItemDelivery {
	
private String name;
private int totalLocation;
private boolean internationalDelivery;

public CourierService(  String name ,int totalLocation ,  boolean internationalDelivery ) {
	this.name = name;
	this.totalLocation = totalLocation;
	this.internationalDelivery = internationalDelivery;
}
@Override 

public int  pickItem() {
System.out.println("pickItem @  " + this.name);
System.out.println("total location  " + this.totalLocation );
System.out.println(" delivery  " + this.internationalDelivery);
return 60;
}

@Override
public int  dropItem(){
	System.out.println("pickItem @  " + this.name);
	System.out.println("total location  " + this.totalLocation );
	System.out.println(" delivery  " + this.internationalDelivery);
	return 50;
}

}