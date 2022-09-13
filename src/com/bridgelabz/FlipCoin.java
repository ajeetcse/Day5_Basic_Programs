package com.bridgelabz;

public class FlipCoin {
    public static void main(String[] args) {
        double random = Math.random();
        String coin ="";
        if (random<0.5)
            coin = "Head";
        else
            coin = "Tail";
        System.out.println("Head and Tail probility = "+coin);
    }
}
