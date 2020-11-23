package HackerRank.DaySix;

import java.util.Scanner;

public class DaySix {

    public static void main(String[] args) {
        {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < t; i++) {
                String s = scan.nextLine();
                String even = "";
                String odd = "";

                for (int j = 0; j < s.length(); j++) {
                    if (j % 2 == 0)
                        even += s.substring(j, j + 1);
                    else
                        odd += s.substring(j, j + 1);
                }
                System.out.println(even + " " + odd);
            }

            scan.close();
        }
    }}
