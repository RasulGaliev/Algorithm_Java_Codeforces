package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task327A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int max = 0;
        int sum;
        for (int begin = 0; begin < n; begin++) {
            for (int end = begin; end < n; end++) {
                sum = 0;
                for (int i = 0; i < begin; i++) {
                    sum += list.get(i);
                }
                for (int i = begin; i <= end; i++) {
                    sum += 1 - list.get(i);
                }
                for (int i = end + 1; i < n; i++) {
                    sum += list.get(i);
                }
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println(max);
    }
}
