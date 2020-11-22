package HackerRank.DayFive;

import java.util.Scanner;

public class DayFive {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i < 11; i++) {
            int soma = n * i;
            System.out.println(n + " x " + i + " = " + soma);
        }
        scanner.close();
    }
}
