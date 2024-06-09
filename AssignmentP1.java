// Write a Java Program to take three numbers from the user and print the greatest number.

package com.core;

import java.util.Scanner;

public class AssignmentP1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		a=sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		b=sc.nextInt();
		System.out.print("Enter 3rd Number : ");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("1st Number is greatest");
			}
			else
			{
				System.out.println("3rd Number is greatest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("2nd Number is greatest");
			}
			else
			{
				System.out.println("3rd Number is greatest");
			}
		}
	}
}
