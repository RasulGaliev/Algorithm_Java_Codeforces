package Task;

import java.util.Scanner;

public class Task189A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int res = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int countA = a * i;
                int countB = b * j;
                int value = n - countA - countB;
                if (value >= 0 && value % c == 0)
                    res = Math.max(res, i + j + value / c);
            }
        }
        System.out.println(res);
    }
}
