////Write a program to add the digits 
//of a user supplied integer.//


package com.practice.assignment3;

import java.util.Scanner;

public class Adddigits {

	public static void main(String[] args) {
		int n, x, sum= 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		n = s.nextInt();
		while (n > 0) {
			x = n % 10;
			sum=sum+x;
			n = n / 10;
		}
		System.out.println("The addition of the digits is " +sum);

	}

}
