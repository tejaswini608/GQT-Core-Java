package com.gqt.corejava.patterns;
import java.util.Scanner;
public class P_16
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}System.out.println();
		}
	}
}