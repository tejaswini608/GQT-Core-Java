package com.gqt.corejava.patterns;
import java.util.Scanner;
public class M_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter size");
		int n=in.nextInt();
		int count=1;
		//System.out.print(count);
		for(int i=1;i<=n;i++)
		{
			count=i;
			for(int j=1;j<=n;j++)
			{
				
				System.out.print(count+" ");
				count=count+n;
			}
			System.out.println();
		}

	}

}
