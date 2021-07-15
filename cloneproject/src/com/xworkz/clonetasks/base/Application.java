package com.xworkz.clonetasks.base;

public class Application implements Cloneable {
public String name;
public String version;
public String[] developers;

public void disPlayInfo() {
	
	System.out.println(this.name);
	System.out.println(this.version);
	if( this.developers != null) {
	for( int i = 0 ; i <developers.length ; i++) {
	System.out.println(this.developers[i]);	
	}
	}
}

@Override
public Object clone() throws CloneNotSupportedException

{
	return super.clone();

}
}
