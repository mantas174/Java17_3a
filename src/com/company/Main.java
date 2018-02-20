package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 3a.
        //​
        // Parašyti programą, kuri paprašytų įvesti 5 skaičius. Baigus skaičių įvedimą, turi būti
        //atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.

        int[] skaicius = new int[5];
        Scanner in = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < skaicius.length; i++) {
            System.out.print("Iveskite " + (i + 1) + " skaiciu: ");
            skaicius[i] = in.nextInt();
            suma += skaicius[i];
        }
        System.out.println("Skaiciu suma " + suma);
        System.out.print("Ivesti skaiciai: ");
        for (int i = 0; i < skaicius.length; i++) {
            System.out.print(skaicius[i] + " ");
        }

    }
}
