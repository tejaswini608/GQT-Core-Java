/**
 * # # # # #
 * # - - - #
 * # - - - #
 * # - - - #
 * # # # # #
 * 
 * 
 */

/**
 * @author teja
 * @category Patterns
 * @Description This is eexample for conditional Statements
 */
package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern1 {

	/**
	 * @param args
	 * @description This condition contains source code for the pattern
	 */
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Size");
	int n=in.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1 || i==n || j==1 || j==n)
			{
				System.out.print(" # ");
			}
			else
				{
				System.out.print(" - ");
				}
		}System.out.println();

	}
	}

}
