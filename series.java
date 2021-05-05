//0,1,3,6,10,15,21... [Difference between nos increases by +1]

package com.practice.assignment3;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		int a = 0, b = 1, n, i, c = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number upto which you wnat to print series");
		n = s.nextInt();
		for (i = 0; i <= n; i++) {
			b = (a) + (c++);
			a = b;
			System.out.println(a);
         }
		

	}

	
}
