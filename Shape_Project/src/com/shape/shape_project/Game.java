package com.shape.shape_project;

import java.util.Scanner;

public class Game {
	
	Game(){
		System.out.println("===========Game has Started===========");
	}
	 
	public void selectShape()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 => 2D Shape");
		System.out.println("Press 2 => 3D Shape");
		int choose = sc.nextInt();
		if(choose==1)
		{	
			System.out.println("You have Choosen 2D Shape");
			Two_D_Shape td = selectTwoDShape();
			td.rotate();
			td.getDetails();
			td.getPerimeter();
			td.getArea();
		}	
		else if(choose==2)
		{
			System.out.println("You have Choosen 3D Shape");
			Three_D_Shape td = selectThreeDShape();
			td.rotate();
			td.getDetails();
			td.getLSA();
			td.getTSA();
			td.getVolume();
		}
		else
		{
			System.out.println("Invalid Shape!");
			selectShape();
		}
		sc.close();   }
		
			public Two_D_Shape selectTwoDShape()
			{
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 for Circle");
			System.out.println("Press 2 For Triangle");
			System.out.println("Press 3 For Rectangle");
			System.out.println("Press 4 For Square");
			int twoDShape = sc.nextInt();
			sc.close();
			if(twoDShape==1)
			{
				System.out.println("You have Choosen Circle");
				System.out.println("Enter radius of Circle : ");
				double radius = sc.nextDouble();
				Circle circle = new Circle(radius);
				return circle;
			}
			else if(twoDShape==2)
			{
				System.out.println("Enter Side A of Triangle : ");
				double sideA = sc.nextDouble();
				System.out.println("Enter Side B of Triangle : ");
				double sideB = sc.nextDouble();
				System.out.println("Enter Side C of Triangle : ");
				double sideC = sc.nextDouble();
				Triangle triangle = new Triangle(sideA,sideB,sideC);
				return triangle;
			}
			else if(twoDShape==3)
			{
				System.out.println("You have Choosen Rectangle");
				System.out.println("Enter Base of Rectangle : ");
				int length = sc.nextInt();
				System.out.println("Enter height of Rectangle : ");
				int breadth = sc.nextInt();
				Rectangle rectangle = new Rectangle(length,breadth);
				return rectangle;
			}
				
				else if(twoDShape==4)
				{
				System.out.println("You have Choosen Square");
				System.out.println("Enter Side of Square : ");
				int side = sc.nextInt();
				Square square = new Square(side);
				return square;
			}	
				else { 
					System.out.println("Invalid Choice");
					return selectTwoDShape();
					
				}
			}
			
			
			
			
			public Three_D_Shape selectThreeDShape()
		   {
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 For Cylinder");
			System.out.println("Press 2 For Sphere");
			System.out.println("Press 3 For Cone");
			int threeDShape = sc.nextInt();
			sc.close();
			if (threeDShape == 1) {
	            System.out.print("Enter radius of Cylinder: ");
	            double radius = sc.nextDouble();
	            System.out.print("Enter height of Cylinder: ");
	            double height = sc.nextDouble();
	            Cylinder cylinder = new Cylinder(radius, height);
	            return cylinder;
	        } else if (threeDShape == 2) {
	            System.out.print("Enter radius of Sphere: ");
	            double radius = sc.nextDouble();
	            Sphere sphere = new Sphere(radius);
	            return sphere;
	        } else if (threeDShape == 3) {
	            System.out.print("Enter radius of Cone: ");
	            double radius = sc.nextDouble();
	            System.out.print("Enter height of Cone: ");
	            double height = sc.nextDouble();
	            Cone cone = new Cone(radius, height);
	            return cone;
	        } 
	        else {
	            System.out.println("Invalid choice!");
	            return selectThreeDShape();
	        }
	    }
}

