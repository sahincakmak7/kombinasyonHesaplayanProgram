package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        int total1 = 1, total2 = 1, total3 = 1;
        int difference;
        int combination;

        System.out.print("1.sayı :");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            total1 = total1 * i;
        }
        System.out.println(n + ". Faktoriyel :" + total1);


        System.out.print("2. sayı :");
        r = input.nextInt();
        for (int i = 1; i <= r; i++) {
            total2 = total2 * i;
        }
        System.out.println(r + ". Faktoriyel :" + total2);


        difference = n - r;
        for (int i = 1; i <= difference; i++) {
            total3 = total3 * i;
        }

        combination = total1 / (total2 * (total3));
        System.out.println("Kombinasyon : " + combination);
    }
}
