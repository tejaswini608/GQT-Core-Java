package com.gqt.corejava.patterns;
import java.util.Scanner;
public class def33{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=in.nextInt();
		//int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>=i;j--)
				System.out.print("  ");
				for(int k=0;k<=i*2;k++)
				{
					
						System.out.print(i+1 +" ");
				}
			System.out.println();
		}/*for (i = 2; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print("  "); // two spaces
            }

            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }*/

	}

}
