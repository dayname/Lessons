package tasks;

import javax.swing.*;
import java.util.Scanner;

public class ex17_9 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the A: ");
        a = scanner.nextInt();
        System.out.print("Enter the B: ");
        b = scanner.nextInt();
        even(a, b);
    }
    public static void even(int a, int b){
        System.out.print("Even numbers from this interval: ");
        if ( a % 2 == 0) {
            for (int i = a; i <= b; i+=2)
                System.out.print(i + " ");
        }
        else {
            for (int i = a + 1; i <= b; i+=2)
                System.out.print(i + " ");
        }
    }
}
