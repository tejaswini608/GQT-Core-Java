package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Y_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
				
			{
				System.out.print("-");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("@");
			}
			System.out.println();
		}

	}

}

