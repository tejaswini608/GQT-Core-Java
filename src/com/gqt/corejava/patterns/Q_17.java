package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Q_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();
		int count=1;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}System.out.println();
		}

	}

}