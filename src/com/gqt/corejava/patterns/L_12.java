package com.gqt.corejava.patterns;
import java.util.Scanner;
public class L_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter size");
		int n=in.nextInt();
		int count=n*n;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(count+"  ");
				count--;
			}
			System.out.println();
		}

	}

}
