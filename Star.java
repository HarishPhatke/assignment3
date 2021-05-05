/*2Draw a diamond of stars e.g. for a input=4
*
***
*****
*******
*****
***
*     */

package com.practice.assignment3;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		int i, j, k = 0, z;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		z = s.nextInt();
		if(z==4)
		{
		for (i = 1; i <= 7; i++) 
		{
			if(i<=4)
			{
				k++;
			}
			else
			{
				k--;
			}
			for (j = 1; j <= 5; j++) 
			{
				if (j <= k) 
				{
					System.out.print("*");
				} 
				else 
				{
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
		}
		
	}

}
