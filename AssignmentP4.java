// Write a Java program to check the given number is Prime or not?
// A prime number is a number that can only be divided by itself and 1 without remainders.

package com.core;

import java.util.Scanner;

public class AssignmentP4 {
	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it's Prime: ");
		n=sc.nextInt();
		boolean isPrime=true;
		if(n<=1)
		{
			isPrime=false;
		}
		else
		{
			for(i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime)
		{
			System.out.println(n + " is a Prime number");
		}
		else
		{
			System.out.println(n + " is not a Prime number");
		}
	}
}