package com.gqt.corejava.patterns;
import java.util.Scanner;
public class W_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{System.out.print("-");
			}
				for(int k=1;k<=n;k++)
				{
					System.out.print("@");
				}
			System.out.println();
		}

	}

}

