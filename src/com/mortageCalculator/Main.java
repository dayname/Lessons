package com.mortageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int p = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float r = scanner.nextFloat();
        System.out.print("Period (Years): ");
        int y = scanner.nextInt();
        r = (r / 100) / 12;
        int n = y * 12;
        double x = Math.pow(1 + r, n);
        double m = (p * (r * x))/(x-1);
        String result = NumberFormat.getCurrencyInstance().format(m); // same things
        System.out.print("Mortgage: ");
        System.out.print(result);
    }
}
