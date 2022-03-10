package tasks;

import java.util.Scanner;

public class ex15_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0){
            n /= 10;
            System.out.print(n + " ");
        }
    }
}
