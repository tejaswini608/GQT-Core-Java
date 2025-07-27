package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pqr37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=n;j>=i;j--)
				System.out.print("  ");
				for(k=i;k>=0;k--)
				{
					
						System.out.print(k +" ");
				}
				for(k=1;k<=i;k++)
				{
					System.out.print(k+ " ");
				}
			System.out.println();
		}
	}
}
