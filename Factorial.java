//Write a program to calculate the factorial of an inputted integer.

package com.practice.assignment3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int f = 1, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want to calculate factorial");
		n = s.nextInt();
		while (n >= 1) {
			f = f * n;
			n--;
		}
		System.out.println(f);

	}

}
