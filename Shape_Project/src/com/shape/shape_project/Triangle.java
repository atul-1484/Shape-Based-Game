package com.shape.shape_project;

public class Triangle implements Two_D_Shape {

	 double sideA;
	 double sideB;
	 double sideC;
	
	public Triangle(double sideA, double sideB, double sideC)
	{
		if(sideA>=0 && sideB>=0 && sideC>=0 && sideA+sideB>sideC && sideB+sideC>sideA && sideC+sideA>sideB)
		{
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
		}
		else
			System.out.println("Invalid Side Entered....");
		
	}
	
	public void getDetails() {
		System.out.println("Side 1 is :"+sideA);
		System.out.println("Side 2 is :"+sideB);
		System.out.println("Side 3 is :"+sideC);		
	}
	
	public void getArea() {
		double s = sideA+sideB+sideC/2;
		double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		System.out.println("Area of Triangle is : "+area);
		
	}

	public void getPerimeter() {
		double perimeter = sideA+sideB+sideC;
		System.out.println("Perimeter of Triangle is : "+perimeter);
		
		
	}


	
		
	
}
