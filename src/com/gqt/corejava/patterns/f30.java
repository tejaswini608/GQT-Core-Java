package com.gqt.corejava.patterns;
import java.util.Scanner;
public class f30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		//int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
				System.out.print(" ");
				for(int j=0;j<=i;j++)
				{
					
						System.out.print(" *");
	
				}
			System.out.println();
		}

	}

}
