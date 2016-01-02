package com.preTraining.epicor;

import java.util.Scanner;

public class ArmStrong {

	
		// TODO Auto-generated method stub
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
			boolean b=isArmStrong(n);
			if(b==true)
				System.out.println(n+" is an ArmStrong number");
			else
				System.out.println(n+" is not an ArmStrong number");
			
			

		}
		public static boolean isArmStrong(int n)
		{
			String str=""+n;
			long sum=0;
			for(int i=0;i<str.length();i++)
			{
				String t=""+str.charAt(i);
				int val=Integer.parseInt(t);
				sum=sum+val*val*val;
				
			}
			if(sum==n)
				return true;
			else
				return false;
			
		}
}
