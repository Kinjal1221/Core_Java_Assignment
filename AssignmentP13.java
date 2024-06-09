//	WAJP to Compare Two String.

package com.core;

import java.util.Scanner;

public class AssignmentP13 {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string");
		str1=sc.nextLine();
		System.out.println("Enter the 2nd string");
		str2=sc.nextLine();
		if (str1.equals(str2)) 
		{
            System.out.println("The strings are equal.");
        } 
		else 
		{
            System.out.println("The strings are not equal.");
        }
	}
}
