package tasks;

import java.util.Scanner;

public class ex6_10 {
    public static void main(String[] args) {
        int x1, x2, y, n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x1 = n / 10;
        x2 = n % 10;
        y = x1 * x2;
        if (n > y)
            System.out.println(n + " > " + x1 + "*" + x2 + "=" + y);

    }
}
