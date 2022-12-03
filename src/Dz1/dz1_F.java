package Dz1;

import java.util.*;

public class dz1_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> e = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                e.add(scanner.nextInt());
            }
            Collections.sort(e);
            int count = 0;
            int result = 0;
            for (int j = 0; j < e.size(); j++) {
                count++;
                if (count >= e.get(j)) {
                    result++;
                    count = 0;
                }
            }
            System.out.println(result);
        }
    }
}
/*int[] newArray = new int[100001];
            for (int j = 0; j < e.size(); j++) {
                newArray[e.get(j)]++;
            }
            int count = 0;
            for (int j = 1; j < newArray.length; j++) {
                count += newArray[j] / j;
                newArray[j] %= j;
            }*/