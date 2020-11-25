package HackerRank.DayEight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayEight {

    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int phone = scan.nextInt();
            scan.nextLine();
            map.put(name, phone);
        }
        while (scan.hasNext()) {
            String s = scan.next();
            if (map.get(s) == null)
                System.out.println("Not found");
            else {
                System.out.println(s + "=" + map.get(s));
            }
        }
        scan.close();
    }
}

