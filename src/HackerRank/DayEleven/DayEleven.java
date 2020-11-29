package HackerRank.DayEleven;

import java.util.Scanner;

public class DayEleven {

    private static final
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] array = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrayRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrayItem = Integer.parseInt(arrayRowItems[j]);
                array[i][j] = arrayItem;
            }
        }
        scanner.close();
    }
}
