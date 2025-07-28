package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
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
			System.out.print("  ");
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
			System.out.print("  ");
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
			System.out.print("  ");
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
			System.out.print("  ");
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
			System.out.println();
		}

	}

}
