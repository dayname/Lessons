package tasks;

import java.util.Scanner;

public class ex2_19 {
    public static void main(String[] args) {
        int a, b, number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextByte();
        a = number - 1;
        b = number + 1;
        System.out.println(a + " " + number + " " + b);
    }
}
