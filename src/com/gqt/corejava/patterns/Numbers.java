package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Numbers {
	/**
	 *  @param args
	 * @description This condition contains source code for the Number pattern
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) //0
			{
				if(i==0 || j==0 || i==n-1 || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++)//1
			{
				if(i+j==n/2 || j==n/2 || i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) //2
			{
				if(i==0 || i==n-1 || i==n/2 || (j==0 && i>=n/2) || (j==n-1 && i<=n/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) //3
			{
				if(i==0 || i==n/2 || (j==n-1 && j<=n/2) || (j==n-1 && j>=n/2)|| i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) //4
			{
				if((j==0 && i<=n/2) || j==n/2 || i==n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) //5
			{
				if(i==0 || i==n-1 || i==n/2 || (j==0 && i<=n/2) || (j==n-1 && i>=n/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) //6
			{
				if(i==0 || j==0 || i==n-1 || i==n/2 || (j==n-1 && i>=n/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) //7
			{
				if(i==0 || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) //8
			{
				if(i==0 || j==n-1 || i==n-1 || i==n/2 || j==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) //9
			{
				if(i==0 || j==n-1 || i==n/2 || i==n-1 || (j==0 && i<=n/2))
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
