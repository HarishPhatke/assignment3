/*Write a program to keep inputting numbers 
until the user enters a 0. Then, 
calculate average of all the numbers.*/

package com.practice.assignment3;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, sum = 0;
		System.out.println("Enter the number, 0 to stop");
		int number = sc.nextInt();
		while (number != 0) {
			sum = sum + number;
			count++;
			number = sc.nextInt();
		}

		float avg = sum / count;

		System.out.println("Average is :" + avg);

	}

}
