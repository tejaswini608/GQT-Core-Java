package com.gqt.corejava.patterns;
import java.util.Scanner;
public class R_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size");
        int n = in.nextInt();

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                if(j%2==0 ^ i%2==0){
                System.out.print("0" + " ");
                }
                else
                {
                    System.out.print("1"+ " ");
                }
            }
            System.out.println();
        }
    }
}
