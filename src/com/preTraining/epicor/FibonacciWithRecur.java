package com.preTraining.epicor;

public class FibonacciWithRecur 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
	}
	public static void fib(int n)
	{
		if(n==0)
		{
			
			return;
		}
		if(n==1)
		{
			System.out.println("0");
			return;
		}
		if(n==2)
		{
			System.out.println("0");
			System.out.println("1");
		}
		else
		{
			fib(n-1);
			System.out.println(n);
		}
			
		
		
		
		
	}
	
}
