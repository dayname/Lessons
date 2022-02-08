package com.mortageCalculator;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = 0;
        float r = 0;
        int y = 0;
        while (true){
        System.out.print("Principal (1k ... 1kk): ");
        p = scanner.nextInt();
        if (p >= 1000 && p <= 1000000)
            break;
        System.out.println("Input correct value");
        }
        while (true) {
            System.out.print("Annual Interest Rate (0 ... 30): ");
            r = scanner.nextFloat();
            if (r >= 0 && r <= 30)
                break;
            System.out.println("!! Input correct !!");
        }
        while (true) {
            System.out.print("Period (0 ... 30): ");
            y = scanner.nextInt();
            if (y >= 0 && y <= 30)
                break;
            System.out.println("Input correct value");
        }
        r = (r / 100) / 12;
        int n = y * 12;
        double x = Math.pow(1 + r, n);
        double m = (p * (r * x))/(x-1);
        String result = NumberFormat.getCurrencyInstance().format(m); // same things
        System.out.print("Mortgage: ");
        System.out.print(result);
    }
}
