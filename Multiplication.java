/*Write a program to generate the multiplication 
table of a given number.*/

package com.practice.assignment3;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int i, n, opt;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number that you want to print multiplication");
		n = s.nextInt();
		for (i = 1; i <= 10; i++) {
			opt = n * i;
			System.out.println(opt);
		}

	}

}
