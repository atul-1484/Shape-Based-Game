package com.shape.shape_project;

public class Square implements Two_D_Shape {
	double side;
	
	public Square(double side) {
		if(side>0)
		this.side=side;
		else
			System.out.println("Invalid Side Entered..!");
	}
	
	
	public void getDetails() {
		System.out.println("Side is : "+side);
		
	}
	

	public void getArea() {
		double area = side*side;
		System.out.println("Area of Square is : "+area);
	}

	
	public void getPerimeter() {
		double perimeter = 4*side;
		System.out.println("Perimter of square is :"+perimeter);
		
	}

	

}
