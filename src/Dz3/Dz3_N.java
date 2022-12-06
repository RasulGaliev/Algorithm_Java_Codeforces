package Dz3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dz3_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp;
        Set<Integer>set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            tmp = scanner.nextInt();
            if (tmp <= n && tmp >= 1)
                set.add(tmp);
        }
        System.out.println(n - set.size());
    }
}
