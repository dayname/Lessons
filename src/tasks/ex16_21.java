package tasks;

import java.util.Scanner;

public class ex16_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum2 = 0;
        System.out.print("Enter number of digits: ");
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++){
            System.out.print("Enter the number: ");
            int n = scanner.nextInt();
            int digits = 0, sum1 = 0, div = 0;
            while (n > 0){
                int p = n % 10;
                sum1 += p;
                digits += 1;
                for (int j = 1; j < n; j++){
                    if (n % j == 0)
                    div++;
                }
                n = n / 10;
            }
        sum2 += sum1;
            System.out.println("Count of digits: " + digits);
            System.out.println("Sum of digits: " + sum1);
            System.out.println("Number of divisors: " + div);
            System.out.println();
        }
        System.out.println("Sum of all digits: " + sum2);
    }
}
