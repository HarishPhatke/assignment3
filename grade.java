/*Write a function that takes the marks of a student as parameters and 
returns his grade.*/

package com.practice.assignment3;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		float a, b, c, average;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks of the first subject");
		a = s.nextInt();
		System.out.println("Enter the marks of the second subject");
		b = s.nextInt();
		System.out.println("Enter the marks of the third subject");
		c = s.nextInt();
		average = getAverage(a, b, c);
		printGrade(average);

	}

	public static float getAverage(float a, float b, float c) {

		return (a + b + c) / 3;
	}

	public static void printGrade(float average) {
		if (average < 50) {
			System.out.println("You got grade:F");
		} else if ((average >= 50) && (average <= 65)) {
			System.out.println("You got grade:E");
		} else if ((average > 65) && (average <= 75)) {
			System.out.println("You got grade:D");
		} else if ((average > 75) && (average <= 85)) {
			System.out.println("You got grade:C");
		} else if ((average > 85) && (average <= 100)) {
			System.out.println("You got grade:B");
		} else {
			System.out.println("You got grade:A");
		}

	}

}
