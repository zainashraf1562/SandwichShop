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

        double discount = 0.00;
        if (age <=17){
            discount = 0.10;
        } else if (age >=65) {
            discount = 0.20;
        }

        double basePrice = 0.00;
        if (size==1){
            basePrice = 5.45;
        } else if (size==2) {
            basePrice = 8.95;
        }
        else System.out.println("Invalid Size");

        double finalPrice = basePrice * (1-discount);
        System.out.println("Total: $" + finalPrice);




    }
}
