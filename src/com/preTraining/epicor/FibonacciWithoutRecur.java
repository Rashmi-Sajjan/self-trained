package com.preTraining.epicor;

import java.util.Scanner;

public class FibonacciWithoutRecur
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter number");
		while(!sc1.hasNextInt())
		 {
			   System.out.println("enter integer value");
			   sc1.next();
		 }
		int num=sc1.nextInt();
		int fib1=0;
		int fib2=1;
		System.out.println("Generated fibonacci series");
		System.out.print(fib1+" "+fib2+" ");
		for(int i=2;i<num;i++)
		{
			int fib=fib1+fib2;
			System.out.print(fib+" ");
			fib1=fib2;
			fib2=fib;
		}
		
		
		
	}
}
