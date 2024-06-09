//	WAJP to reverse an array of integer values.

package com.core;

import java.util.Scanner;

public class AssignmentP20 {

	public static void main(String[] args) {
		int size,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		
		int[] array=new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		for (int i=0;i<size/2;i++) 
		{
            temp = array[i];
            array[i] = array[size- 1-i];
            array[size- 1-i] = temp;
        }
		System.out.println("Reversed array:");
        for (int i=0;i<size;i++) 
        {
            System.out.println(array[i] + " ");
        }
	}
}
