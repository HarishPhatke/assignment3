/*1.	Draw a pyramid of stars. e.g. for a input = 4
*
***
*****
*******   */

package com.practice.assignment3;

import java.util.Scanner;

public class PyramidStar {

	public static void main(String[] args) {
		int i, j, k;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		k = s.nextInt();
		if (k == 4) {
			for (i = 1; i <= 5; i++) {
				for (j = 1; j <= 5; j++) {
					if (j <= i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println("");
			}
		}

	}

}
