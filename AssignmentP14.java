//	WAJP to concatenate a given string to the end of another string.

package com.core;

import java.util.Scanner;

public class AssignmentP14 {

	public static void main(String[] args) {
		String str1,str2,concatenatedString ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string:");
		str1=sc.nextLine();
		System.out.println("Enter the 2nd string:");
		str2=sc.nextLine();
		concatenatedString=str1+str2;
		System.out.println("The concatenated string is : " +concatenatedString);
	}
}
