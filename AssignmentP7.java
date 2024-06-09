// W.A.J.P to Print pattern Given Below.
//	1)
//	1
//	12
//	123
//	1234
//	12345

//	2)
//	1
//	01
//	101
//	01010
//	101010

//	3)
//		1
//	   2 2
//    3 3 3
//   4 4 4 4

//	4)
//       *
//     * * *
//   * * * * *
//     * * *
//       *

package com.core;

import java.util.Scanner;

public class AssignmentP7 {

	public static void main(String[] args) {
		int rows;
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of rows for the pattern : ");
		System.out.print("Enter the number of rows for the upper half of the pattern (excluding the middle row): ");
		rows=sc.nextInt();
//		for (int i=1;i<=rows;i++)
//		{
//	3.		for(int k=0;k<rows-i;k++)
//			{
//				System.out.print(" ");
//			}
//			for (int j=1;j<=i;j++) 
//	1.		{
//				System.out.print(j);
//	        }
//	2.		if ((i + j) % 2 == 0) 
//			{
//				System.out.print("1");
//	        } 
//			else 
//			{
//				System.out.print("0");
//	        }
//	3.		{
//                System.out.print(i + " ");
//            }
//			System.out.println();
		 // Print the upper half of the diamond including the middle row
        for (int i=0;i<=rows;i++) 
        {
            // Print leading spaces
        	for (int j=0;j<rows-i;j++) 
        	{
                System.out.print("  ");
            }
            // Print stars with spaces
        	for (int j=0;j<2*i+1;j++) 
        	{
                System.out.print("* ");
            }
            System.out.println();
        }
        // Print the lower half of the diamond
        for (int i=rows-1;i>=0;i--) 
        {	
            // Print leading spaces
            for (int j=0;j<rows-i;j++)
            {
                System.out.print("  ");
            }
            // Print stars with spaces
            for (int j=0;j<2*i+1;j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
	