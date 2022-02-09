package tasks;

import java.util.Scanner;

public class ex2_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.pow(a, 2));
        System.out.println(Math.pow(b, 2));
        System.out.println(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
