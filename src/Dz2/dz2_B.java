package Dz2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class dz2_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        Collections.sort(a);
        int d;
        int max_d = a.get(0) * 2;
        for (int i = 0; i < a.size() - 1; i++) {
            d = a.get(i + 1) - a.get(i);
            if (d > max_d)
                max_d = d;
        }
        d = l - a.get(a.size() - 1);
        if (d * 2 > max_d)
            max_d = d * 2;
        System.out.println(max_d / 2.0);
    }



}
