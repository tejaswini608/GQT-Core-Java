/**
 * @author teja
 * @category Patterns
 * @Description This is eexample for conditional Statements
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;
public class UniversalPattern {

	/**
	 *  @param args
	 * @description This condition contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)//A
			{
				if(i==0 || i==n/2 || j==0 || j==n-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//B
			{
				if(i==0 || i==n/2 || j==0 || j==n-1 || i==n-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//c
			{
				if(i==0 || j==0 || i==n-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//D
			{
				if(i==0 || i==n-1 || j==0 || j==n-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//E
			{
				if(i==0 || i==n/2 || j==0 || i==n/2 || i==n-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//F
			{
				if(i==0 || i==n/2 || j==0 || i==n/2)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//G
			{
				if(i==0 || j==0 || i==n-1 || (i==n/2 && j>=n/2) || (i>=n/2 && j==n-1))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//H
			{
				if(j==0 || i==n/2 || j==n-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//I
			{
				if(i==0 || i==n-1 || j==n/2)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//J
			{
				if(i==0 || j==n/2 || (i==n-1 && j<=n/2) )
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//k
			{
				if(j==0 || i+j==n/2 || i-j==n/2)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//L
			{
				if(j==0 || i==n-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//M
			{
				if(j==0 || j==n-1 || (i==j && j<=n/2) || (i+j==(n-1) && j>=n/2))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//N
			{
				if(j==0 || j==n-1 || (i==j && i/2==j/2))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//O
			{
				if(j==0 || j==n-1 || i==0 ||i==n-1 )
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//P
			{
				if(j==0 || i==0 || (j==n-1 && i<=n/2) || i==n/2)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//Q
			{
				if((j==0 && i<=n/2) || (i==0 && j<=n/2) || (j==3*n/4 && i<=n/2) || (j==0 && i<=n/2) || (i==3*n/4 && j<=n/2) || (i==j && j>=n/2))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//R
			{
				if((i==0 && j<=n/2)|| j==0 || (i==n/2 && j<=n/2)|| (j==(n-1)/2 && i<=n/2) || i-j==n/2)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//S
			{
				if(i==0 || i==n-1 || i==n/2 || (j==0 && i<=n/2)  || (j==n-1 && i>=n/2))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//T
			{
				if(i==0 || j==n/2)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//U
			{
				if(j==0 || i==n-1 || j==n-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//v
			{
				if(i-j==n/2 || i+j==(n-1)+(n/2) || (j==0 && i<=n/2) || (j==n-1 && i<=n/2))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//W
			{
				if(j==0 || j==n-1 || (i+j==(n-1) && i>=n/2) || (i==j && j>=n/2))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//x
			{
				if(i==j || i+j==(n-1))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//Y
			{
				if(i+j==(n-1) || (i==j && j<=n/2))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//Z
			{
				if(i==0 || i==n-1 || i+j==(n-1))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();	
		}

	}

}
