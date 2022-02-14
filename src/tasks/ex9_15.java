package tasks;

import java.util.Scanner;

public class ex9_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 1 || a > 12)
            System.out.println("It's not month number");
        else if (a >= 1 && a <= 2 || a == 12)
            System.out.println("Zima");
        else if (a >= 3 && a <= 5)
            System.out.println("Spring");
        else if (a >= 6 && a <= 8)
            System.out.println("Summer");
        else
            System.out.println("Autumn");
    }
}
