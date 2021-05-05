/*3.	Draw a outline diamond of stars e.g. for a input=4
*
* *
*   *
*     *
*   *
* *
*
*/

package com.practice.assignment3;

public class Star1 {

	public static void main(String[] args) {
    int i,j;
    for(i=1;i<=7;i++)
    {
    	for(j=1;j<=4;j++)
    	{
    		if((i<=7)&&(j==1)||(i==2&&j==2)||(i==6&&j==2)||(i==3&&j==3)||(i==5&&j==3)||(i==4&&j==4))
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
