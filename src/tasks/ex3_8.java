package tasks;

import java.util.Scanner;

public class ex3_8 {
    public static void main(String[] args) {
        int l, h;
        double s, p;
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        h = scanner.nextInt();
        s = 0.5 * l * h;
        p = 2 * (l/2 + h);
        System.out.println("Square: " + s);
        System.out.println("Perimeter of rectangle: " + p);


    }
}
