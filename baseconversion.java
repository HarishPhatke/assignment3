/*Write a program to convert an inputted 
number from any base to any other base.*/


package com.practice.assignment3;



	import java.io.*;
import java.util.Scanner;
	 
	class baseconversion
	{
	
	static int val(char c)
	{
	    if (c >= '0' && c <= '9')
	        return (int)c - '0';
	    else
	        return (int)c - 'A' + 10;
	}
	 
	
	static int toDeci(String str,
	                  int base)
	{
	    int len = str.length();
	    int power = 1; 
	                   
	    int num = 0;
	    int i;
	 
	    
	    for (i = len - 1; i >= 0; i--)
	    {
	       
	        if (val(str.charAt(i)) >= base)
	        {
	        System.out.println("Invalid Number");
	        return -1;
	        }
	 
	        num += val(str.charAt(i)) * power;
	        power = power * base;
	    }
	 
	    return num;
	}
	 
	
	public static void main (String[] args)
	{
	    int base;
		String str = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
	  str=s.nextLine();
		
	 System.out.println("Enter the base");
	 base= s.nextInt();
	 
	    System.out.println("Decimal equivalent of "+
	                        str + " in base "+ base +
	                                     " is "+ " "+
	                              toDeci(str, base));
	}
	}
	 
	
