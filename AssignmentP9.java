//	WAJP to sum values of an array.

package com.core;

import java.util.Scanner;

public class AssignmentP9 {

	public static void main(String[] args) {
		int size,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		
		int[] array=new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
			sum=sum+array[i];
		}
		System.out.println("The sum of the array elements is : "+sum);
	}
}
