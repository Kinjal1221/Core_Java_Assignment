//	WAJP to calculate the average value of array elements.

package com.core;

import java.util.Scanner;

public class AssignmentP10 {

	public static void main(String[] args) {
		int size,sum=0,average;
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
		average=sum/size;
        System.out.println("The average value of the array elements is : "+average);
	}
}
