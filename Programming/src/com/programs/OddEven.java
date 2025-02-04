package com.programs;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter te num:- ");
			int num = s.nextInt();
			switch (num/2) {
			case 1: System.out.println("Even");
				
				break;

			default:System.out.println("Odd");
				break;
			}
		
	}

}
