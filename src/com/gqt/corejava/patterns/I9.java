package com.gqt.corejava.patterns;
import java.util.Scanner;
public class I9 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
in.close();
	}

}
