//Write a program to calculate the GCD of a number.

package com.practice.assignment3;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		int a,b,G;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = s.nextInt();
		System.out.println("Enter the second number");
		b = s.nextInt();
		for(G=a<b?a:b;G>=1;G--)
		{
			if(a%G==0&&b%G==0)
				break;
		}
		System.out.println("GCD of two number is "+G);

	}

}
