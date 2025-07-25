package com.gqt.corejava.patterns;
import java.util.Scanner;
public class V_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(count+ " ");
				count++;
			}System.out.println();
		}

	}

}
