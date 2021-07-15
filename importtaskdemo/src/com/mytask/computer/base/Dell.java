package com.mytask.computer.base;

public class Dell extends Computer {

		
		protected double weight;
		protected boolean camera;
		
		public Dell(double weight,boolean camera){
			super();
			
			System.out.println("invoked laptop constructor()");
			this.weight = weight;
			this.camera = camera;
		}
		
		public void  displayProperties(){
			System.out.println("invoked dell displayProperties()");
			System.out.println("weight is " + this.weight  +"  kg");
			System.out.println("camera  quality " + this.camera);
		}
	}
	
	
	

