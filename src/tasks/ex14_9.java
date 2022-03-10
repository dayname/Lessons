package tasks;

public class ex14_9 {
    public static void main(String[] args) {
        int n, i, index = 1, max = 100;
        for (i = 0; i < 24; i++){
            n = 100 + (int)(Math.random() * (999 - 100 + 1));
            System.out.print(n + " ");
            if (n > max){
                max = n;
                index = i + 1;
            }
        }
        System.out.println();
        System.out.println(index);
    }
}
