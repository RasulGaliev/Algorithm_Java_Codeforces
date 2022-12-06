package Dz3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dz3_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            h.add(scanner.nextInt());
        }

        int s = 0;
        for (int i = 0; i < k; i++) {
            s += h.get(i);
        }
        int min = s;
        int index = 1;
        for (int i = k; i < n; i++) {
            s += h.get(i);
            s -= h.get(i - k);
            if (min > s) {
                min = s;
                index = i - k + 2;
            }
        }
        System.out.println(index);
    }
}
