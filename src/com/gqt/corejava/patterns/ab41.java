package com.gqt.corejava.patterns;
import java.util.Scanner;
public class ab41 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int n=sc.nextInt();
	//int count=0;
	for(int i=1;i<=n;i++) {
		for(int j=n;j>i;j--)
		System.out.print("  ");
		for(int j=1;j<=i;j++) 
		{
		//char c=(char)('A'+i-j);
				System.out.print(j+" ");
			}
		for(int j=i-1;j>=1;j--) {
			//char c=(char)('A'+i-j);

			System.out.print(j+" ");
		}
		
		System.out.println();
	}
	}
}