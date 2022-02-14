package tasks;


import java.util.Scanner;

public class ex8_27 {
    public static void main(String[] args) {
        int a1, b1;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a1 = a % 10;
        b1 = b % 10;
        if (a1 > b1)
            System.out.println(a);
        else if (a1 < b1)
            System.out.println(b);
        else
            System.out.println("Цифры единиц равны");
    }
}
