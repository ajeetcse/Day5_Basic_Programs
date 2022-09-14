package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("This Number is Even number");
        }else {
            System.out.println("This number is Odd Number");
        }
    }
}
