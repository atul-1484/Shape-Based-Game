package com.shape.shape_project;

import java.util.Scanner;

public class User {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		char c;
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
			do{
				g.selectShape();
			System.out.println("=========================================");
			System.out.println("Enter Y/y to Continue");
			 c =sc.next().charAt(0);
			 
		
		}while(c=='Y'||c=='y');
			System.out.println("===========Thank You! Program Ends......!===================");
	}

}
