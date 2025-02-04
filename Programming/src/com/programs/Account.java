package com.programs;

public class Account {

	public static void main(String[] args) {
		double amt = 25000.00;
		double withdraw = 12000;
		int pin = 1234;
		if(amt>=withdraw && pin ==1234) {
			System.out.println("Withdrawal Success");
			double balance = amt - withdraw;
			System.out.println("Remaining Balance is :- " + balance);
		}
		else {
			System.out.println("Pin is Invalid");
		}
	}

}
