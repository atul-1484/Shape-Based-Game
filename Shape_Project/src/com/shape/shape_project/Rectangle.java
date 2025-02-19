package com.shape.shape_project;

public class Rectangle implements Two_D_Shape {

	double length;
	double breadth;
	
	public Rectangle(double length,double breadth)
	{
		if(length>0 && breadth>0)
		{
		this.length=length;
		this.breadth=breadth;
		}
		else if(length>0) {
			System.out.println("Invalid Breadth Entered");
			this.length=length;
		}
		else if(breadth>0) {
			System.out.println("Invalid Length Entered");
			this.breadth=breadth;
		}	
		else
			System.out.println("Invalid length and Breadth Entered ");
	}
	
	

	public void getDetails() {
		System.out.println("Length is : "+length);
		System.out.println("Breadth is : "+breadth);
		
	}
	
	
	public void getArea() {
		double area = length*breadth;
		System.out.println("Area is : "+area+" units");
	}

	
	public void getPerimeter() {
		double perimeter = 2*length*breadth;
		System.out.println("Perimeter is : "+perimeter+" units");
	}


}
