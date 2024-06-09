//	WAJP to find the maximum and minimum value of an array.

package com.core;

import java.util.Scanner;

public class AssignmentP12 {

	public static void main(String[] args) {
		int size,max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		
		int[] array=new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		max = array[0];
        min = array[0];
        for (int i = 1; i < size; i++)
        {
            if (array[i] > max) 
            {
                max = array[i];
            }
            if (array[i] < min) 
            {
                min = array[i];
            }
        }
        System.out.println("The maximum value in the array is: " +max);
        System.out.println("The minimum value in the array is: " +min);
	}
}
