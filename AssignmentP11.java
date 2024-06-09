//	WAJP to find the index of an array element.

package com.core;

import java.util.Scanner;

public class AssignmentP11 {

	public static void main(String[] args) {
		int size,elementToFind;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		
		int[] array=new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		 System.out.print("Enter the element to find : ");
	     elementToFind=sc.nextInt();
	     
	     int index = -1;
	     for (int i = 0; i < size; i++)
	     {
	    	 if (array[i] == elementToFind) 
	    	 {
	    		 index = i;
	             break;
	         }
	     }
	     
	     if (index != -1) 
	     {
	    	 System.out.println("The index of " + elementToFind + " in the array is: " + index);
	     }
	     else 
	     {
	    	 System.out.println("Element " + elementToFind + " not found in the array.");
	     }
	}
}
