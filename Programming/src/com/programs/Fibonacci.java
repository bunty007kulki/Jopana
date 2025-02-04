package com.programs;

public class Fibonacci {

	public static void main(String[] args) {
		int n=5,first=1,sec=0;
		for(int i=0;i<=n;i++)
		{
			int fib=first+sec;
			first=sec;
			sec=fib;
			System.out.println(fib);
		}

	}

}
