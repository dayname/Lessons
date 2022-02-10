package tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex2_28 {
    public static void main(String[] args) {
        double meters, kilometrs;
        Scanner scanner = new Scanner(System.in);
        int kobelt = scanner.nextInt();
        meters = 185.2 * kobelt;
        kilometrs = meters / 1000;
        System.out.println("Метр: " + meters);
        System.out.println("Километр: " + meters);
    }
}
