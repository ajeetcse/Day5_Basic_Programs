package com.bridgelabz;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of A ");
        int a = sc.nextInt();
        System.out.println("Enter a value of B ");
        int b= sc.nextInt();
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping A "+a);
        System.out.println("After swapping B "+b);
    }
}
