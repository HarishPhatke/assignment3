/*Write a program to test if an inputted number is an Armstrong 
number or not.*/

package com.practice.assignment3;

import java.util.Scanner;

public class armsrongnumber {

	public static void main(String[] args) {
		int n, x, rev = 0, d;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		n = s.nextInt();
		d = n;
		while (n > 0) {
			x = n % 10;
			rev = rev * 10 + x;
			n = n / 10;
		}
		System.out.println("The reverse of the number is " + rev);
		if (rev == d) {
			System.out.println("Entered number is armstrong number");
		}

	}

}
