package com.gqt.corejava.patterns;
import java.util.Scanner;
public class S_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}System.out.println();
		}

	}

}
