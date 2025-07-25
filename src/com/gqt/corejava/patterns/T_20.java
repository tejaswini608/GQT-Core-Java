package com.gqt.corejava.patterns;
import java.util.Scanner;
public class T_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			char c=(char)('A'+i);
			for(int j=0;j<=i;j++)
			{
				System.out.print(c+" ");
			}System.out.println();
		}

	}

}
