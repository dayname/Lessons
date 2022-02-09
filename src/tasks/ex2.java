package tasks;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = scanner.nextInt();

        System.out.println("()" + name + "()");
        System.out.println("()" + number + "()");
    }
}
