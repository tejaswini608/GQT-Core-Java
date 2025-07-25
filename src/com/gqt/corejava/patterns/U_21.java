package com.gqt.corejava.patterns;
import java.util.Scanner;
public class U_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}System.out.println();
		}

	}

}
