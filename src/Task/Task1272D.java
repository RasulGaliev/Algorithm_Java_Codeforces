package Task;

import java.util.Scanner;

public class Task1272D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dp = new int[200005];
        int[] d = new int[200005];
        int[] a = new int[200005];
        int n = scanner.nextInt();
        int x;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            dp[i] = 1;
            d[i] = 1;
            if (a[i] > a[i - 1]) {
                dp[i] = dp[i - 1] + 1;
                d[i] = d[i - 1] + 1;
            }
            if (i != 1 && a[i] > a[i - 2]) {
                d[i] = Math.max(d[i], dp[i - 2] + 1);
            }
            ans = Math.max(d[i], ans);
        }
        System.out.println(ans);

    }
}

