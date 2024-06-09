// Write a Java program to find the factorial for given number.

package com.core;

import java.util.Scanner;

public class AssignmentP3 {
	public static void main(String[] args) {
		int n,i;
		long factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find the Factorial : ");
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Factorial is not defined for the negative numbers.");
		}
		else
		{
			for(i=1;i<=n;i++)
			{
				factorial*=i;
			}
			System.out.println("Factorial of "+n+ " is: "+factorial);
		}
	}

}
