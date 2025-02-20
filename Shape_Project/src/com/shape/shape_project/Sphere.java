package com.shape.shape_project;

public class Sphere implements Three_D_Shape {
	    double radius;

	    public Sphere(double radius) {
	    	if(radius>0)
	        this.radius = radius;
	    	else
	    		System.out.println("Invalid Radius Entered...!");
	    }
	    
	    @Override
		public void getDetails() {
			System.out.println(" Radius is : "+radius);
			
		}


	    @Override
	    public void getVolume() {
	        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	        System.out.println("Volume is : "+volume+"Unit");
	    }

	    public void getTSA() {
	        double tsa =  4 * Math.PI * radius * radius;
	        System.out.println("Total Surface Area is : "+tsa+"Unit");
	    }

	    public void getLSA() {
	        System.out.println("Lateral Surface Area is : "+  4 * Math.PI * radius * radius+"Unit"); 
	        // For sphere, LSA = TSA
	    }

		
		
	}
