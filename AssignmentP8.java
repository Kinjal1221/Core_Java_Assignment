//	WAJP to compute the sum of the first 100 prime numbers

package com.core;

public class AssignmentP8 {

	public static void main(String[] args) {
		int count=0,number=2,sum=0;
        System.out.println("The first 100 prime numbers are:");
        while (count < 100) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                sum=sum+number;
                count++;
            }
            number++;
        }
        System.out.println("\nThe sum of the first 100 prime numbers is: " + sum);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
