/**
 * 
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * 
 */
public class pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter Size");
			int n=in.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(i==j || i==n || j==1 || j==n)
					{
						System.out.print(" # ");
					}
					else
						{
						System.out.print(" - ");
						}
				}System.out.println();

			//}
			}

	}

}
