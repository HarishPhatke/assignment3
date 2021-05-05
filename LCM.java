Write a //program to calculate the LCM of two numbers.

package com.practice.assignment3;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		int a,b,l;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = s.nextInt();
		System.out.println("Enter the second number");
		b = s.nextInt();
		for(l=1;l<=a*b;l++)
		{
			if(l%a==0&&l%b==0)
				break;
		}
		System.out.println("LCM of two number is "+l);

	}

}
