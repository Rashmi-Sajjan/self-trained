package com.preTraining.epicor;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		while(!sc.hasNextInt())
		{
			System.out.println("Enter int value");
			sc.next();
		}
		int num=sc.nextInt();
		boolean b=isPalindrome(num);
		if(b==true)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
	}
	public static boolean isPalindrome(int n)
	{
		
		String str=""+n;
		char[] c=str.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<=j)
		{
			if(c[i]!=c[j])
				return false;
			else
			{
				i++;
				j--;
			}
			
		}
		return true;
	}

}
