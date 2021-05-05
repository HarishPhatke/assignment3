//Write a program to determine if an inputted number is 
//prime or composite.

package com.practice.assignment3;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int n,count=0,i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number you want to check");
		n= s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("you entered number  " +n+ "is prime number");
				
			}
			else
			{
				System.out.println("you entered number  " +n+ "is not prime number");
			}
		}
		

	}


