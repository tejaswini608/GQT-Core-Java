package com.gqt.corejava.patterns;
import java.util.Scanner;
public class jkl35 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the no of lines");
	     n = sc.nextInt();
		for(i=n;i>=1;i--)
	     {
	         for(j=i;j<n;j++)
	            System.out.print(" ");
	         
	         for(j=1;j<=(2*i-1);j++)
	            System.out.print(i);
	         
	       System.out.println("");
	     } 
	 }

}