package tasks;

import java.util.Scanner;

public class ex18_12 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        fill(a);
        write(a);

    }
    public static void fill(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = 100 + (int)(Math.random() * 900);
        }
    }

    public static void write(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
