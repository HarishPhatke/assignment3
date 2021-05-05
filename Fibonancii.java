//Write a program to generate the Fibonacci series.

package com.practice.assignment3;

import java.util.Scanner;

public class Fibonancii {

	public static void main(String[] args) {
		int n, i, a = -1, b = 1, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number upto which you want to print series");
		n = s.nextInt();
		for (i = 0; i <= n; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
