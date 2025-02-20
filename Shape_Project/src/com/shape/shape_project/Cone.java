package com.shape.shape_project;

public class Cone implements Three_D_Shape {
	
	 double radius;
	 double height;

    public Cone(double radius, double height) {
    	if(radius>0 && height>0)
		{
		this.radius=radius;
		this.height=height;
		}
		else if(radius>0) {
			System.out.println("Invalid Height Entered");
			this.radius=radius;
		}
		else if(height>0) {
			System.out.println("Invalid Height Entered");
			this.height=height;
		}	
		else
			System.out.println("Invalid length and Breadth Entered ");		
	}
	
    @Override
	public void getDetails() {
		System.out.println("Radius is : "+radius+" units");
		System.out.println("Height is : "+height+" units");
		
	}

    @Override
    public void getVolume() {
        double volume =  (1.0 / 3.0) * Math.PI * radius * radius * height;
        System.out.println("Volume is : "+volume+" units");
    }

    @Override
    public void getTSA() {
        double slantHeight = Math.sqrt((radius * radius) + (height * height));
        double tsa =  Math.PI * radius * (radius + slantHeight);
        System.out.println("Total Surface Area is : "+tsa+" units");
    }

    @Override
    public void getLSA() {
        double slantHeight = Math.sqrt((radius * radius) + (height * height));
        double lsa = Math.PI * radius * slantHeight;
        System.out.println("Lateral Surface Area is : "+lsa+" units");
    }

	
}
