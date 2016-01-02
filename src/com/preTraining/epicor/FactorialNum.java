package com.preTraining.epicor;

import java.util.Scanner;

public class FactorialNum
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		while(!sc.hasNextInt())
		{
			System.out.println("Enter int value");
			sc.next();
		}
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println("Factorial of given num is "+res);
		

	}
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	
	
}
