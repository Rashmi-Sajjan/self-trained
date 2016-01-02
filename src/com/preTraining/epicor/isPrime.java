package com.preTraining.epicor;

import java.util.Scanner;

public class isPrime
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
		boolean b=prime(n);
		if(b==false)
			System.out.println(n+" is not a prime number");
		else
			System.out.println(n+" is a prime number");
		

	}
	public static boolean prime(int n)
	{
		if(n<0)
			n=-n;
		if(n==0 || n==1)
			return false;
		if(n==2||n==3||n==5||n==7)
			return true;
		if(n==4||n==6||n==8||n==9)
			return false;
		if(n%2==0)
			return false;
		for(int i=3;i<n/2;i=i+2)
		{
			if(n%i==0)
				return false;
		}
		return true;
			
	}

}
