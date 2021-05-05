//Write a program to calculate simple interest.

package com.demo.assingment2;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		float p, t, r;
		// Take input from user
		Scanner s = new Scanner(System.in);

		System.out.println("Enter principle ammount");
		p = s.nextFloat();

		System.out.println("Enter time period");
		t = s.nextFloat();

		System.out.println("Enter rate of interest");
		r = s.nextFloat();
		// Method call
		calculateSimpleInterest(p, t, r);
	}

	// Method defination
	public static void calculateSimpleInterest(float p, float t, float r) {
		float i = (p * t * r) / 100;
		System.out.println("the simple interest is" + i);
	}

}
