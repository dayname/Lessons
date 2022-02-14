package tasks;

import java.util.Scanner;

public class ex6_12 {
    public static void main(String[] args) {
        int a, b, c;
        float d, x;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = b*b - a*c*4;
        if (d < 0)
            System.out.println("Нет корней");
        else
            System.out.println((-b + d)/2*a);
            System.out.println((-b - d)/2*a);

    }
}
