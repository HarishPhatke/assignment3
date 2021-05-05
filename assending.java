/*Write a function which accepts three numbers and returns them in 
ascending order.*/

package com.practice.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class assending {

	public static void main(String[] args) {
		//Method 1:
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number"); 
		 a = s.nextInt();
		System.out.println("enter second number"); 
		 b = s.nextInt();
		System.out.println("enter third number"); 
		 c = s.nextInt();
		getassending(a, b, c);
		 
		//Method 2:- Using Collections class sort method
		List<Integer> al = new ArrayList<>();
		System.out.println("enter first number");
		al.add(s.nextInt());
		System.out.println("enter second number");
		al.add(s.nextInt());
		System.out.println("enter third number");
		al.add(s.nextInt());
		Collections.sort(al);
		System.out.println("Arrayist after sorting:"+al);
	}

	public static void getassending(int a, int b, int c) {
		if ((a < b) && (a < c)) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		} else if ((b < a) && (b < c)) {
			System.out.println(b);
			if (a < c) {
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(a);
			}
		} else {
			System.out.println(c);
			if (a < b) {
				System.out.println(a);
				System.out.println(b);
			} else {
				System.out.println(b);
				System.out.println(a);
			}
		}

	}

}
