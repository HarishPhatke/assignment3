//Write a program to print an inputted integer in its binary 
//representation.

package com.practice.assignment3;

import java.util.Scanner;

public class BinaryConversion
{
  static void bin(long n)
  {
    long i;
    System.out.print("0");
    for (i = 1 << 30; i > 0; i = i / 2)
    {
      if((n & i) != 0)
      {
        System.out.print("1");
      }
      else
      {
        System.out.print("0");
      }
    }
  }
 
  
  public static void main(String[] args)
  {
    int n;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number you want to convert");
    n= s.nextInt();
    bin(n);
    
    
    
  }
}
 

