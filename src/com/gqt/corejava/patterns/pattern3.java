package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter Size");
			int n=in.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print("- ");
				}
				for(int j=1;j<=2*i-1;j++)
					{
					System.out.print("$ ");
					}
				System.out.println();
			}

	}

}
