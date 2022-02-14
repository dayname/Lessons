package tasks;

import java.util.Scanner;

public class ex4_21 {
    public static void main(String[] args) {
        int x1, x2, x3, x4, n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x1 = n / 1000;
        x2 = n / 100 % 10;
        x3 = n / 10 % 10;
        x4 = n % 10;
        int r = x2 * 1000 + x3 * 100 + x4 * 10 + x1;
        System.out.println(r);
    }
}
