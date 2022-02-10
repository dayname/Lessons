package tasks;

import java.util.Scanner;

public class ex4_4 {
    public static void main(String[] args) {
        int first, second, third;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scanner.nextInt();
        third = n % 10;
        second = n / 10 % 10;
        first = n / 100 % 10;
        System.out.println(third + " " + second + " " + first);
    }
}
