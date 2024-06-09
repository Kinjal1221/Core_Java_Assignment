//	WAJP to demonstrate try catch block.
//	WAJP to demonstrate multiple catch blocks

package com.core;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class AssignmentP15_16 {

	public static void main(String[] args) {
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number or a non-integer value : ");
		try 
		{
//			int num=sc.nextInt();
			String input=sc.next();
			int num = Integer.parseInt(input);
			result = 100 / num;
			System.out.println("Result of division: " +result);
		}catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch(ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		} catch(Exception e){
			System.out.println("An error occurred: " +e.getMessage());
		} finally {
		
		}
	}
}
