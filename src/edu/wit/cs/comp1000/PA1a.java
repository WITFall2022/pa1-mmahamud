package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int yards;
		int feet;
		int inches; 
		System.out.printf("Enter Number of yards");
		yards = input.nextInt();
		
	
		System.out.printf("Enter Number of feet");
		feet = input.nextInt();
		
		System.out.printf("Enter Number of inches");
		inches = input.nextInt();
		int ans; 
		ans = feet*12+yards*36+inches;
		System.out.print(ans);
	
	}

}
