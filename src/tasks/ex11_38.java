package tasks;
import javax.swing.*;
import java.util.Scanner;
public class ex11_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 15; i++){
            int k = 100 + (int)(Math.random() * 899);
            int k1 = k / 100;
            int k2 = k / 10 % 10;
            if (k % n == 0)
                System.out.print(Math.ceil(Math.sqrt(k1)) + " ");
            else
                System.out.print(Math.floor(Math.sqrt(k2)) + " ");

        }

    }
}
/* work work work */