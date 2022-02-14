package tasks;

import java.util.Scanner;

public class ex10_8 {
    public static void main(String[] args) {
        int n, a, b, t;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = n - 5;
        b = n + 5;
        t = a + (int)(Math.random() * (b - a + 1));
        System.out.println(t);
        if (t == n)
            System.out.println("Computer guessed the number");
        else
            System.out.println("Computer didn't guess the number");

    }
}
