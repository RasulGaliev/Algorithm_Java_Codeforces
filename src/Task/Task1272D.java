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
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        int begin = 0;
        int max = 0;
        int del = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] <= array[i - 1] && i != 1 && array[i] > array[i - 2]) {
                if (del!= 0) {
                    if (i - 1 - begin > max)
                        max = i - 1 - begin;
                    begin = del;
                } else {
                    begin++;
                }
                del = i;

            } else if (array[i] <= array[i - 1]) {
                if (del!= 0) {
                    if (i - 1 - begin > max)
                        max = i - 1 - begin;
                }
                begin = i;
                del = 0;
            }
        }
        if (max < n - begin)
            max = n - begin;
        System.out.println(max);
    }*/

