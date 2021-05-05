/*Input a number, generate that many numbers 
of the non-Fibonacci series.*/

package com.practice.assignment3;

import java.util.Scanner;

public class Nonfibonancci {

	public static void main(String[] args) {
		int a =0,b = 1,c = 0,d,n,x;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the range");
		n = s.nextInt();
		while(c<=n)
		{
		c=a+b;
		a=b;
		b=c;
		d=a+b;
		for(x=c+1;x<d;x++)
		{
		if(x<=n)
		{
		System.out.println(x);
		}
		else
		{
		break;
		}
		}

	}

}}
