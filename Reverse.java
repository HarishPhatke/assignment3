//Write a program to reverse the digits of a user 
//supplied integer.


package com.practice.assignment3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n, x, rev = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		n = s.nextInt();
		while (n > 0) {
			x = n % 10;
			rev = rev * 10 + x;
			n = n / 10;
		}
		System.out.println("The reverse of the number is " + rev);

	}

}
