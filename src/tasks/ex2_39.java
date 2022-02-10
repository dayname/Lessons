package tasks;

import java.util.Scanner;

public class ex2_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String patronamic = scanner.nextLine();
        System.out.println(name.charAt(0) + "."  + surname.charAt(0) + "." + patronamic);
    }
}
