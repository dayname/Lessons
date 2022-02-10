package tasks;

import java.util.Scanner;

public class ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = n % 10;
        n = n / 10;
        System.out.println(n + " " + k);
    }
}
