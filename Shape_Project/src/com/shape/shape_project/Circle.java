package com.shape.shape_project;

public class Circle implements Two_D_Shape {
	
	 
	 double radius;
	 public Circle(double radius)
	 {
		 if(radius>=0)
		 this.radius=radius;
		 else
			 System.out.println("Invalid Radius!");
	 }
	 
	 public void getDetails() {
		 System.out.println("Radius OF Circle is : "+radius+"Unit");
	 }
	 
	public void getArea() {
		double area = Math.PI*radius*radius;
		System.out.println("Area of Circle is : "+area+" units");	
	}
	
	public void getPerimeter() {
		double perimeter = 2*Math.PI*radius;
		System.out.println("Area of Circle is : "+perimeter+" units");
	}

	
		
	}


	

	


