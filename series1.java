/*1,3,6,8,11,13,16... 
[Difference between nos is: +2, +3, +2 …]*/

package com.practice.assignment3;

import java.util.Scanner;

public class series1 {

	public static void main(String[] args) {
		int n, cons = 2, cons1 = 3, op, ser = 1, i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number upto which you wnat to print series");
		n = s.nextInt();
		System.out.println(ser);
		for (i = 0; i <= n; i++) {
			op = ser + cons;
			System.out.println(op);
			ser = op + cons1;
			System.out.println(ser);
		}

	}

}
