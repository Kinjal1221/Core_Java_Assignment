// Write a Java program to display the first 10 natural numbers using While Loop.

package com.core;

public class AssignmentP2 {
	public static void main(String[] args) {
		int n=1,sum=0;
		System.out.println("First 10 Natural numbers are : ");
		while(n<=10)
		{
			System.out.println(n);
			sum=sum+n;
			n++;
		}
		System.out.println("The sum of the first 10 natural number is : "+sum);
	}
}
