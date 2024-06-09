//	WAJP to Copy one array into another

package com.core;

import java.util.Scanner;

public class AssignmentP19 {

	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		
		int[] originalArray=new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<size;i++)
		{
			originalArray[i]=sc.nextInt();
		}
		int[] copiedArray = new int[size];
		for (int i=0; i<size;i++) 
		{
            copiedArray[i] = originalArray[i];
        }
		System.out.println("Original array : ");
        for (int i=0;i<size;i++) 
        {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
        System.out.println("Copied array:");
        for (int i=0;i<size;i++) 
        {
            System.out.print(copiedArray[i] + " ");
        }
	}
}
