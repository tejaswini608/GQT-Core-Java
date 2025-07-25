package com.gqt.corejava.patterns;
import java.util.Scanner;
public class H8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter size: ");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
