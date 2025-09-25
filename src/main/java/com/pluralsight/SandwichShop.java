package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner shop = new Scanner(System.in);

        System.out.println("Choose size of the sandwich (1 or 2):");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");

        int size = shop.nextInt();

        System.out.println("Whats your age?");
        int age = shop.nextInt();

        if (size == 1){
            if (age<=17){
                System.out.println("Total Price $"+5.45*(1-0.10));
            } else if (age>=65) {
                System.out.println("Total Price $"+5.45*(1-0.20));
            }
            else System.out.println("Total Price $"+5.45);
        }
        if (size == 2){
            if (age<=17){
                System.out.println("Total Price $"+8.95*(1-0.10));
            } else if (age>=65) {
                System.out.println("Total Price $"+8.95*(1-0.20));
            }
            else System.out.println("Total Price $8.95");
        }



    }
}
