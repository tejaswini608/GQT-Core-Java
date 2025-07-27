/*import java.util.Scanner;
public class mno36 {

	public static void main(String[] args) {
		int i,j,n,k;
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter size");
	     n = sc.nextInt();
		for(i=n;i>=1;i--)
	     {
	         for(j=i;j<n;j++)
	            System.out.print(" ");
	         
	         for(j=1;j<=(2*i-1);j++)
	            System.out.print(i+" ");
	         
	       System.out.println("");
	     } 
		for(i=1;i<n;i++)
		{
			for(j=n;j>=i;j--)
				System.out.print("  ");
				for(k=0;k<=i*2;k++)
				{
					
						System.out.print(i+1 +" ");
				}
			System.out.println(" ");
		}
	 }

}*/
//package com;

import java.util.Scanner;
public class mno36 {
    public static void main(String[] args) {
        int i, j, n, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines");
        n = sc.nextInt();
        for (i = n; i >= 1; i--) {
            for (j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        for (i = 2; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print("  "); 
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}