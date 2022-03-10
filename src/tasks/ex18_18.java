package tasks;

import java.util.Scanner;

public class ex18_18 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        fill(a);
        firstStart(a);
        System.out.println();
        secondEnd(a);

    }

    public static void fill(int[] a) {
        for (int i = 0; i < a.length; i++)
            a[i] = 10 + (int) (Math.random() * 90);
    }

    public static void firstStart(int[] a) {
        for (int i = 0; i < a.length / 2 + a.length % 2; i++)
            System.out.print((a[i]) + " ");
    }

    public static void secondEnd(int[] a) {
        for (int i = a.length - 1; i >= a.length / 2 + a.length % 2; i--)
            System.out.print((a[i]) + " ");
    }
}
